import car.Car;
import racing.RacingGame;
import spark.ModelAndView;
import spark.template.handlebars.HandlebarsTemplateEngine;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static spark.Spark.*;

public class Main {
    public static void main(String[] args) {
        port(8080);

        get("/", (req, res) -> {
            return render(new HashMap<>(), "/index.html");
        });

        post("/name", (req, res) -> {
            Map<String, Object> model = new HashMap<>();
            String nameInput = req.queryParams("names");
            List<Car> cars = Car.createCars(Arrays.asList(nameInput.split(" ")));

            req.session(true);
            req.session().attribute("cars", cars);

            model.put("cars", cars);
            return render(model, "/game.html");
        });

        get("/result", (req, res) -> {
            Map<String, Object> model = new HashMap<>();
            int tryCount = Integer.parseInt(req.queryParams("turn"));
            List<Car> cars = req.session().attribute("cars");

            RacingGame racingGame = new RacingGame(cars, tryCount);
            racingGame.playRacing();

            model.put("cars", racingGame.getResultState());
            return render(model, "/result.html");
        });
    }

    private static String render(Map<String, Object> model, String templatePath) {
        return new HandlebarsTemplateEngine().render(new ModelAndView(model, templatePath));
    }
}
