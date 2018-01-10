import java.util.HashMap;
import java.util.Map;

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
    private static final String CAR_RACING = "carRacing";
    private static final String CARS = "cars";

    public static void main(String[] args) {
        port(8080);

        get("/", (req, res) -> render(null, "/index.html"));

        post("/name", (req, res) -> {
            String names[] = req.queryParams(NAMES).split(SPACE);

            CarRacing carRacing = CarRacing.readyForRacing();
            carRacing.createCarsByName(names);
            req.session().attribute(CAR_RACING, carRacing);

            Map<String, Object> model = new HashMap<>();
            model.put(NAMES, names);
            return render(model, "/game.html");
        });

        post("/result", (req, res) -> {
            int tryCount = Integer.parseInt(req.queryParams("turn"));

            CarRacing carRacing = req.session().attribute(CAR_RACING);
            carRacing.setTryCount(tryCount);

            Map<String, Object> model = new HashMap<>();
            model.put(CARS, carRacing.startRacing());
            return render(model, "/result.html");
        });
    }

    public static String render(Map<String, Object> model, String templatePath) {
        return new HandlebarsTemplateEngine().render(new ModelAndView(model, templatePath));
    }

}