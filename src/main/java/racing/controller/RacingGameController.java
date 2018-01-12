package racing.controller;

import racing.RacingGame;
import racing.SimpleDeciderToGo;
import racing.model.Car;
import racing.model.GameConfiguration;
import racing.model.GameResult;
import spark.ModelAndView;
import spark.template.handlebars.HandlebarsTemplateEngine;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static spark.Spark.*;

public class RacingGameController {
    private static int PORT = 8080;

    public static void main(String[] args) {
        port(PORT);

        get("/index.html", (req, res) -> {
            Map<String, Object> model = new HashMap<>();
            model.put("name", req.queryParams());
            return render(model, "/index.html");
        });

        post("/name", (req, res) -> {
            String names = req.queryParams("names");
            List<Car> cars = GameConfiguration.makeCars(names);

            Map<String, Object> model = new HashMap<>();
            model.put("cars", cars);
            model.put("names", names);
            return render(model, "/game.html");
        });

        get("/result", (req, res) -> {
            int turn = Integer.parseInt(req.queryParams("turn"));
            String names = req.queryParams("names");

            GameConfiguration gameConfiguration = new GameConfiguration(names, turn);
            RacingGame racingGame = new RacingGame(new SimpleDeciderToGo());
            GameResult gameResult = racingGame.startGame(gameConfiguration);

            Map<String, Object> model = new HashMap<>();
            model.put("results", gameResult.getGameResult());
            model.put("winnersMessage", gameResult.getGameWinnerResult());
            return render(model, "/result.html");
        });
    }

    private static String render(Map<String, Object> model, String templatePath) {
        return new HandlebarsTemplateEngine().render(new ModelAndView(model, templatePath));
    }
}
