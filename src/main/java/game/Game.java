package game;

import game.racingGame.RacingGame;
import game.racingGame.View;
import spark.ModelAndView;
import spark.template.handlebars.HandlebarsTemplateEngine;

import java.util.HashMap;
import java.util.Map;

import static spark.Spark.get;
import static spark.Spark.port;
import static spark.Spark.post;
import static spark.Spark.staticFiles;

public class Game {

    private static RacingGame racingGame;

    public static void main(String[] args) {
        port(8080);

        staticFiles.location("/templates");

        get("/test", (req, res) -> {
            Map<String, Object> model = new HashMap<>();
           return render(model,"/index.html");
        });

        post("/name", (req, res) ->{
            String names = req.queryParams("names");
            String[] nameOfCars = names.split(" ");
            racingGame = new RacingGame(nameOfCars, 0);

            Map<String, Object> model = new HashMap<>();
            model.put("cars", racingGame.getCars());
            return render(model, "/game.html");
        });

        get("/result", (req, res) -> {
            Integer trialTime = Integer.parseInt(req.queryParams("turn"));
            racingGame.setTrialTime(trialTime);
            racingGame.move();
            racingGame.pickWinners();

            Map<String, Object> model = new HashMap<>();
            model.put("result", View.getVisibleResult(racingGame.getResult()));
            return render(model, "/result.html");
        });
    }


    public static String render(Map<String, Object> model, String templatePath) {
        return new HandlebarsTemplateEngine().render(new ModelAndView(model, templatePath));
    }
}