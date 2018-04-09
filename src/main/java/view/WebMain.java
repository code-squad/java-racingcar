package view;

import racing.RacingGame;
import racing.player.Car;
import racing.result.GameResult;
import spark.ModelAndView;
import spark.template.handlebars.HandlebarsTemplateEngine;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static spark.Spark.*;
import static spark.Spark.staticFiles;

public class WebMain {
    private static RacingGame racingGame;

    public static void main(String[] args) {
        staticFiles.location("/templates");

        get("/", (req, res) -> null);

        post("/name", (req, res) -> {
            String names = req.queryParams("names");

            racingGame = new RacingGame(names);

            Map<String, Object> model = new HashMap<>();
            model.put("cars", racingGame.cars);
            model.put("greeting", "Hello");

            return render(model, "game.html");
        });

        get("/result", (req, res) -> {
            int turn = Integer.parseInt(req.queryParams("turn"));

            List<List<Car>> result = new ArrayList<>();
            for (; turn > 0; turn--) {
                result.add(racingGame.nextTurn().cars);
            }

            String winnerNames = GameResult.getWinnerNames(GameResult.getWinners(racingGame.cars));

            Map<String, Object> model = new HashMap<>();
            model.put("result", result);
            model.put("winnersNames", winnerNames);

            return render(model, "result.html");
        });
    }

    private static String render(Map<String, Object> model, String templatePath) {
        return new HandlebarsTemplateEngine().render(new ModelAndView(model, templatePath));
    }
}
