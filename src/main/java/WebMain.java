import java.util.HashMap;
import java.util.List;
import java.util.Map;

import car.Car;
import car.CarRacing;
import spark.ModelAndView;
import spark.template.handlebars.HandlebarsTemplateEngine;

import static car.RacingUtils.SPACE;
import static spark.Spark.get;
import static spark.Spark.port;
import static spark.Spark.post;

/**
 * Created by youngjae on 2018. 1. 6..
 */
public class WebMain {
    private static final String NAMES = "names";
    private static final String CARS = "cars";

    public static void main(String[] args) {
        port(8080);

        get("/", (req, res) -> render(null, "/index.html"));

        post("/name", (req, res) -> {
            String names[] = req.queryParams(NAMES).split(SPACE);
            req.session().attribute(NAMES, names);

            Map<String, Object> model = new HashMap<>();
            model.put(NAMES, names);
            return render(model, "/game.html");
        });

        post("/result", (req, res) -> {
            int tryCount = Integer.parseInt(req.queryParams("turn"));

            String names[] = req.session().attribute(NAMES);
            CarRacing carRacing = CarRacing.readyForRacing(names, tryCount);
            List<Car> cars = carRacing.startRacing();

            Map<String, Object> model = new HashMap<>();
            model.put(CARS, cars);
            return render(model, "/result.html");
        });
    }

    public static String render(Map<String, Object> model, String templatePath) {
        return new HandlebarsTemplateEngine().render(new ModelAndView(model, templatePath));
    }

}