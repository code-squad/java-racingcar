package game;

import com.google.common.collect.Maps;
import game.domain.Car;
import game.domain.GameResult;
import game.domain.RacingGame;
import game.view.ResultView;
import spark.ModelAndView;
import spark.template.handlebars.HandlebarsTemplateEngine;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static spark.Spark.*;

public class WebMain {

    private static final HandlebarsTemplateEngine handlebarsTemplateEngine = new HandlebarsTemplateEngine();

    public static void main(String[] args) {
        port(8080);

        get("/", (req, res) -> render(Maps.newHashMap(), "index.html"));

        post("/name", (req, res) -> {
            String[] names = req.queryParams("names")
                                .split(" ");

            List<Car> cars = Car.of(names);

            Map<String, Object> model = new HashMap<>();
            model.put("cars", cars);
            model.put("count", cars.size());

            return render(model, "game.html");
        });

        post("/result", (req, res) -> {
            String[] names = req.queryParamsValues("names[]");
            Integer tryNo = Integer.valueOf(req.queryParams("turn"));

            RacingGame racingGame = new RacingGame(names);
            GameResult gameResult = racingGame.move(tryNo);

            Map<String, Object> model = new HashMap<>();
            model.put("result", ResultView.html(gameResult));
            model.put("winner", ResultView.join(gameResult.winner()));

            return render(model, "result.html");
        });
    }

    private static String render(Map<String, Object> model, String path) {
        return handlebarsTemplateEngine.render(new ModelAndView(model, path));
    }
}
