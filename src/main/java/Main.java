import game.RacingGame;
import spark.ModelAndView;
import spark.template.handlebars.HandlebarsTemplateEngine;

import java.util.HashMap;
import java.util.Map;

import static spark.Spark.*;

public class Main {

    static RacingGame game;

    public static void main(String[] args) {
        port(8080);
        get("/", (req, res) -> {
            return render(null, "/index.html");
        });

        post("/name", (req, res) -> {
            String name = req.queryParams("names");
            game = new RacingGame(name);
            Map<String, Object> model = new HashMap<>();
            model.put("names", game.getCarsName());

            return render(model, "/game.html");
        });

        post("/result", (req, res) -> {
            game.moveTry(Integer.parseInt(req.queryParams("turn")));
            Map<String, Object> model = new HashMap<>();
            model.put("cars", game.getCars());
            return render(model, "/result.html");
        });
    }

    private static String render(Map<String, Object> model, String templatePath) {
        return new HandlebarsTemplateEngine().render(new ModelAndView(model, templatePath));
    }
}
