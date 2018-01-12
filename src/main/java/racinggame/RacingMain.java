package racinggame;

import static spark.Spark.port;
import static spark.Spark.post;
import static spark.Spark.staticFileLocation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import spark.ModelAndView;
import spark.template.handlebars.HandlebarsTemplateEngine;

public class RacingMain {
    public static void main(String[] args) {
        port(8080);
        staticFileLocation("templates");
        post("/name",(req, res) -> {
            String carNames = req.queryParams("names");
            req.session().attribute("carNames", carNames);

            List<Car> cars = new ArrayList<>();
            Arrays.stream(carNames.split(" ")).forEach(i -> cars.add(new Car(i)));

            Map<String, Object> map = new HashMap<>();
            map.put("cars", cars);
            return  render(map, "game.html");
        });

        post("/result", (req, res)->{
            String turn = req.queryParams("turn");
            String carNames = req.session().attribute("carNames");
            Racing racing = new Racing(Integer.parseInt(turn), carNames.split(" "));
            racing.racing();
            Map<String, Object> map = new HashMap<>();
            map.put("cars",racing.getCars());
            map.put("winners", racing.getWinnerCars());
            return  render(map, "result.html");
        });

    }
    public static String render(Map<String, Object> model, String templatePath) {
        return new HandlebarsTemplateEngine().render(new ModelAndView(model, templatePath));
    }
}
