package web;

import org.apache.commons.lang3.StringUtils;
import racing.RacingResult;
import racing.RacingResultUtils;
import racing.RandomRacingGame;
import spark.ModelAndView;
import spark.template.handlebars.HandlebarsTemplateEngine;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static spark.Spark.get;
import static spark.Spark.port;
import static spark.Spark.post;

public class Main {

    private static String[] carNames;

    public static void main(String[] args) {
        port(8080);

        get("/", (req, res) -> render(Collections.emptyMap(), "/index.html"));

        post("/name", (req, res) -> {
            carNames = StringUtils.split(req.queryParams("names"), ' ');

            return render(Collections.singletonMap("names", carNames), "/game.html");
        });

        post("/result", (req, res) -> {
            int turn = Integer.valueOf(req.queryParams("turn"));

            RandomRacingGame randomRacingGame = new RandomRacingGame(carNames, turn);

            List<RacingResult> results = randomRacingGame.doRacing();
            String winners = RacingResultUtils.getBestCarNames(results);

            Map<String, Object> model = new HashMap<>();
            model.put("results", results);
            model.put("winners", winners);

            return render(model, "/result.html");
        });
    }

    private static String render(Map<String, Object> model, String templatePath) {
        return new HandlebarsTemplateEngine().render(new ModelAndView(model, templatePath));
    }
}
