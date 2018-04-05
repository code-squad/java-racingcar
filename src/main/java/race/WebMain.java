package race;

import static spark.Spark.port;
import static spark.Spark.post;
import static spark.Spark.staticFiles;

import race.domain.DefaultRaceRule;
import race.domain.GameResult;
import race.domain.RacingGame;
import spark.ModelAndView;
import spark.template.handlebars.HandlebarsTemplateEngine;

import java.util.HashMap;
import java.util.Map;

public class WebMain {
    public static void main(String[] args) {
        final String RACER_NAME_DELIMITER = " ";
        final String SESSION_RACER_NAMES_KEY = "racers";

        port(8090);
        staticFiles.location("/templates");
        
        post("/name", (req, res) -> {
            String param = req.queryParams("names");
            String[] params = param.split(RACER_NAME_DELIMITER);
            req.session().attribute(SESSION_RACER_NAMES_KEY, params);

            Map<String, Object> model = new HashMap<>();
            model.put("names", params);
            return render(model, "game.html");
        });
        
        
        post("/result", (req, res) -> {
            String param = req.queryParams("turn");
            int turn = Integer.parseInt(param);
            String[] racers = req.session().attribute(SESSION_RACER_NAMES_KEY);

            RacingGame game = new RacingGame(racers, turn);
            game.race(new DefaultRaceRule());

            GameResult result = new GameResult(game.getParticipants());
            
            Map<String, Object> model = new HashMap<>();
            model.put("result", game.getParticipants());
            model.put("winners", result.getWinnerNames());
            return render(model, "result.html");
        });
    }
    

    /**
     * @see <a href = "http://sparkjava.com/documentation#views-and-templates">Spark Views and Templates</a>
     */
    private static String render(Map<String, Object> model, String templatePath) {
        return new HandlebarsTemplateEngine().render(new ModelAndView(model, templatePath));
    }
}
