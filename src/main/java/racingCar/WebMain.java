package racingCar;

import racingCar.domain.Racing;
import racingCar.domain.Winner;
import racingCar.view.InputView;
import racingCar.view.ResultView;
import spark.ModelAndView;
import spark.template.handlebars.HandlebarsTemplateEngine;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static spark.Spark.*;

public class WebMain {
    static List<String> carsName;

    public static void main(String[] args) {
        staticFiles.location("/templates");
        port(8080);

        get("/index", (req, res) -> {
            return render(new HashMap<>() ,"index.html");
        });

        post("/name", (req, res) -> {
            Map<String, Object> model = new HashMap<>();
            carsName = InputView.splitCarsName(req.queryParams("names"));
            model.put("names", carsName);
            return render(model,"game.html");
        });

        get("/result", (req, res) -> {
            Map<String, Object> model = new HashMap<>();
            int tryCount = Integer.parseInt(req.queryParams("turn"));

            Racing racingCar = new Racing(carsName, tryCount);
            racingCar.race();

            Winner winner = new Winner(racingCar.getGameResult());

            ResultView resultView = new ResultView(racingCar.getGameResult());
            resultView.result(winner.winnerCheck());

            model.put("names", carsName);
            model.put("result", racingCar.getGameResult());
            model.put("winner", winner.winnerCheck());
            return render(model,"result.html");
        });
    }

    public static String render(Map<String, Object> model, String templatePath) {
        return new HandlebarsTemplateEngine().render(new ModelAndView(model, templatePath));
    }
}
