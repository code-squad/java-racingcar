package racingcar;

import spark.ModelAndView;
import spark.template.handlebars.HandlebarsTemplateEngine;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static spark.Spark.*;

public class RacingCarWebMain {
    private static String[] names = null;

    public static void main(String[] args) {
        port(8080);

        get("/", (request, response) -> {
            return render("index.html");
        });

        post("/name", (request, response) -> {
            names = InputRacingCarView.separateCarName(
                    InputRacingCarView.checkInputCarNamesValue(
                            request.queryParams("names")));

            Map<String, Object> model = new HashMap<>();
            model.put("names", names);

            return render(model, "game.html");
        });

        get("/result", (request, response) -> {
            Racing racing = new Racing(names);
            int turn = Integer.valueOf(request.queryParams("turn"));

            for (int i = 0; i < turn; i++) {
                racing.carPositionMove();
            }

            List<String> result = new ArrayList<>();
            int carsInfoSize = racing.getCarsInfoSize();
            for (int i = 0; i < carsInfoSize; i++) {
                result.add(OutputRacingCarView.printCarMove(racing.findCarNameByIndex(i), racing.findCarMoveByIndex(i)));
            }

            Map<String, Object> model = new HashMap<>();
            model.put("result", result);
            model.put("winner", racing.returnRacingWinningResult());

            return render(model, "result.html");
        });

    }

    public static String render(String templatePath) {
        return render(null, templatePath);
    }

    public static String render(Map<String, Object> model, String templatePath) {
        return new HandlebarsTemplateEngine().render(new ModelAndView(model, templatePath));
    }

}
