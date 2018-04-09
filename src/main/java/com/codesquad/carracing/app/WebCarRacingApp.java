package com.codesquad.carracing.app;

import com.codesquad.carracing.domain.*;
import com.codesquad.carracing.infrastructure.BoundedRandomGenerator;
import com.codesquad.carracing.view.RacingRecords;
import spark.ModelAndView;
import spark.template.handlebars.HandlebarsTemplateEngine;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

import static spark.Spark.*;


public class WebCarRacingApp {
    public static void main(final String[] args) {
        port(8080);

        get("/", (req, res) -> {
            return render(null, "/index.html");
        });

        post("/name", (req, res) -> {
            final String names = req.queryParams("names");
            final List<Car> cars = CarRacing.generateCarsFromNames(names, " ");

            final Map<String, Object> model = new HashMap<>();
            model.put("cars", cars);
            model.put("names", names);
            return render(model, "/game.html");
        });

        post("/result", (req, res) -> {
            final String names = req.queryParams("names");
            final String turn = req.queryParams("turn");
            final int numberOfTries = Integer.parseInt(turn);

            final CarRacing racing = new CarRacing(names, " ");

            final Map<String, Object> model = new HashMap<>();
            final RacingResult racingResult = run(numberOfTries, racing);
            final RacingRecords records = RacingRecords.writeRecord(racingResult.getCars(), "&nbsp;");

            model.put("winners", String.join(", ", racingResult.getWinners()));
            model.put("records", records.getRecords());

            return render(model, "/result.html");
        });
    }

    private static RacingResult run(final int numberOfTries, final CarRacing racing) {
        final MoveStrategy moveStrategy = createMoveStrategy();

        for (int i = 0; i < numberOfTries; i++) {
            racing.nextTry(moveStrategy);
        }

        return racing.current();
    }

    private static MoveStrategy createMoveStrategy() {
        final RandomGenerator generator = new BoundedRandomGenerator(10, new Random());
        return new RandomMoveStrategy(generator);
    }


    private static String render(final Map<String, Object> model, final String templatePath) {

        return new HandlebarsTemplateEngine().render(new ModelAndView(model, templatePath));
    }
}
