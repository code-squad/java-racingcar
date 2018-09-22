package racingcar;

import spark.ModelAndView;
import spark.template.handlebars.HandlebarsTemplateEngine;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static spark.Spark.*;

public class RacingCarWebMain {
    private static String[] names = null;

    public static void main(String[] args) {
        port(8080);
        staticFiles.location("static");

        post("/name", (request, response) -> {
            names = InputRacingCarView.separateCarName(
                    InputRacingCarView.checkInputCarNamesValue(
                            request.queryParams("names")));

            Map<String, Object> model = new HashMap<>();
            model.put("names", names);

            return render(model, "game.html");
        });

        get("/result", (request, response) -> {
            RacingCar racingCar = new RacingCar(names);
            int turn = Integer.valueOf(request.queryParams("turn"));

            List<Car> carInfo = null;
            for(int i = 0; i < turn; i++) {
                carInfo = racingCar.carPositionMove();
            }

            Map<String, Object> model = new HashMap<>();
            model.put("carInfo", carInfo);
            model.put("winner", racingCar.searchWinner());

            return render(model, "result.html");
        });

    }

    public static String render(Map<String, Object> model, String templatePath) {
        return new HandlebarsTemplateEngine().render(new ModelAndView(model, templatePath));
    }
}
