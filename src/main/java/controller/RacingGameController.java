package controller;

import model.Car;
import model.RacingGame;
import spark.ModelAndView;
import spark.template.handlebars.HandlebarsTemplateEngine;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static spark.Spark.get;
import static spark.Spark.post;

public class RacingGameController {
    private RacingGame racingGame;
    List<Car> cars;

    public RacingGameController() {
        onGame();
        getName();
        onIndex();
        onResult();
    }

    public void run() {
        racingGame.runGames();
    }

    public List<Car> initCars(String[] carNames) {
        List<Car> cars = new ArrayList<>();
        for (int i = 0; i < carNames.length; i++) {
            cars.add(new Car(carNames[i]));
        }
        return cars;
    }

    private void onIndex() {
        get("/", (req, res) -> render(new HashMap<>(), "index.html"));
    }

    private void getName() {
        post("/name", (req, res) -> {
            cars = initCars(req.queryParams("names").split(" "));

            res.redirect("/game");
            return "";
        });
    }

    private void onGame() {
        get("/game", (req, res) -> {
            Map<String, Object> map = new HashMap<>();
            map.put("cars", cars);
            return render(map, "game.html");
        });
    }

    private void onResult() {
        post("/result", (req, res) -> {
            int racingCount = Integer.parseInt(req.queryParams("turn"));
            racingGame = new RacingGame(racingCount, cars);
            racingGame.runGames();
            Map<String, Object> map = new HashMap<>();
            map.put("cars", cars);
            map.put("winners", String.join(",", racingGame.getWinners()));
            return render(map, "result.html");
        });
    }

    private String render(Map<String, Object> model, String templatePath) {
        return new HandlebarsTemplateEngine().render(new ModelAndView(model, templatePath));
    }
}
