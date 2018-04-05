package racingcar;

import com.google.common.collect.Maps;
import racingcar.domain.Car;
import racingcar.domain.RacingGame;
import racingcar.domain.RandomRule;
import racingcar.view.OutputView;
import spark.ModelAndView;
import spark.template.handlebars.HandlebarsTemplateEngine;

import java.util.*;
import java.util.stream.IntStream;
import static java.util.stream.Collectors.*;

import static spark.Spark.*;

public class WebMain {
    private static RacingGame racingGame;

    public static void main(String[] args) {
        port(8080);

        get("/", (request, response) ->
               render(null,"/index.html"));

        post("/name", (request, response) -> {
            String [] carNames = request.queryParams("names").split(" ");
            racingGame = new RacingGame(new RandomRule(), carNames);

            Map<String, Object> model = new HashMap<>();
            model.put("carNames", carNames);
            return render(model, "/game.html");
        });

        get("/result", (request, response) -> {
            racingGame.play();

            Map<String, Object> model = new HashMap<>();
            model.put("turnResults", IntStream.range(0, Integer.parseInt(request.queryParams("turn")))
                    .mapToObj(turn -> racingGame.play())
                    .map(cars -> cars.stream()
                            .map(car -> {
                                Map<String, Object> carMap = new HashMap<>();
                                carMap.put("car", car);
                                carMap.put("tripView", OutputView.getCarTripView(car));
                                return carMap;
                            })
                            .toArray())
                    .collect(toList()));
            model.put("winners", racingGame.getWinner());
            return render(model, "/result.html");
        });
    }

    private static String render(Map<String, Object> model, String templatePath) {
        return new HandlebarsTemplateEngine().render(new ModelAndView(model, templatePath));
    }
}
