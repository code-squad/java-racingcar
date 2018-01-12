package racing;


import spark.ModelAndView;
import spark.template.velocity.VelocityTemplateEngine;

import java.util.HashMap;
import java.util.Map;

import static spark.Spark.get;
import static spark.Spark.post;
import static spark.Spark.staticFiles;

public class RacingController {

    private static String[] carNames;

    public static void main(String[] args) {
        staticFiles.location("/templates");

        post("/name", (req, res)-> {
            Map<String, Object> model = new HashMap<>();
            carNames = req.queryParams("names").split(InputValidationUtil.SPLIT_SYMBOL);
            model.put("names", carNames);
            return render(model, "/templates/game.html");
        });

        get("/result", (req, res) -> {
            RaceGame raceGame = new RaceGame();
            raceGame.initRace(carNames, Integer.parseInt(req.queryParams("turn")));

            Map<String, Object> model = new HashMap<>();
            model.put("records", raceGame.getResult());
            return render(model, "/templates/result.html");
        });
    }

    public static String render(Map<String, Object> model, String templatePath) {
        return new VelocityTemplateEngine().render(new ModelAndView(model, templatePath));
    }
}
