import car.Car;
import car.Race;
import spark.ModelAndView;
import spark.template.handlebars.HandlebarsTemplateEngine;

import java.util.*;

import static spark.Spark.*;

public class Main {
    private static HandlebarsTemplateEngine handlebarsTemplateEngine = new HandlebarsTemplateEngine();

    public static void main(String[] args) {
        List<Car> cars = new ArrayList<>();

        port(8080);

        get("/",(req,res) -> render(new HashMap<>(), "/index.html"));

        post("/name",(req,res) ->  {
            Map<String, Object> model = new HashMap<>();

            Arrays.asList(req.queryParams("names").split(" ")).forEach(carName -> cars.add(new Car(carName,0)));

            model.put("cars", cars);
            return render(model, "/game.html");
        });

        get("/result",(req,res) ->  {
            Map<String, Object> model = new HashMap<>();

            new Race(cars, Integer.parseInt(req.queryParams("turn"))).startRacing();

            model.put("cars", cars);
            return render(model, "/result.html");
        });
    }

    private static String render(Map<String, Object> model, String templatePath) {
        return handlebarsTemplateEngine.render(new ModelAndView(model, templatePath));
    }
}
