import spark.ModelAndView;
import spark.Request;
import spark.Response;
import spark.Session;
import spark.template.handlebars.HandlebarsTemplateEngine;

import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static spark.Spark.*;

/**
 * Created by hoon on 2018. 1. 6..
 */
public class Main {

    public static void main(String args[]) {

        port(8080);

        get("/", (req, res) -> render(null, "index.html"));

        post("/name", (Request req, Response res) -> {
            List<Car> cars = new ArrayList<>();

            String[] names = Utils.splitWithDelimiter(req.queryParams("names"), " ");
            for(int i = 0; i < names.length; i++) {
                cars.add(new Car(names[i]));
            }

            DataBase.data.put("cars", cars);

            Map<String, Object> model = new HashMap<>();
            model.put("cars", cars);
            return render(model, "game.html");
        });

        get("/result", (Request req, Response res) -> {
            Integer turn = Integer.parseInt(req.queryParams("turn"));
            List<Car> cars = (List<Car>) DataBase.data.get("cars");

            Racing racing = new Racing(cars, turn);
            Map<String, Object> model = new HashMap<>();

            model.put("cars", racing.doRace());
            return render(model, "result.html");
        });
    }

    public static String render(Map<String, Object> model, String templatePath) {
        return new HandlebarsTemplateEngine().render(new ModelAndView(model, templatePath));
    }
}