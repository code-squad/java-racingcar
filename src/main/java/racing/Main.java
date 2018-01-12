package racing;

import spark.ModelAndView;
import spark.template.handlebars.HandlebarsTemplateEngine;

import java.util.*;

import static spark.Spark.*;

/**
 * Created by Joeylee on 2018-01-06.
 */
public class Main {

    private static String[] carNames;

    public static void main(String[] args) {

        staticFiles.location("/templates");

        get("/", (req, res) -> {
            return render(null, "index.html");
        });

        post("/name", (req, res) -> {
            List<Car> cars = new ArrayList<>();
            carNames = req.queryParams("names").split(" ");
            
            Map<String, Object> model = new HashMap<>();
            for (int i = 0; i < carNames.length; i++) {
                cars.add(new Car(carNames[i]));
            }
            model.put("cars", cars);
            return render(model, "game.html");
        });

        get("/result", (req, res) -> {

            int tryCount = Integer.parseInt(req.queryParams("turn"));
            Map<String, Object> model = new HashMap<>();

            RacingGame racingGame = new RacingGame(carNames);
            racingGame.racing(tryCount);
            model.put("cars", racingGame.getCarList());
            return render(model, "result.html");
        });

    }

    public static String render(Map<String, Object> model, String templatePath) {
        return new HandlebarsTemplateEngine().render(new ModelAndView(model, templatePath));
    }
}
