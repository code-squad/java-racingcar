package racingcar.main;

import racingcar.domain.GameResult;
import racingcar.domain.RacingGame;
import racingcar.view.InputView;
import racingcar.view.ResultView;
import spark.ModelAndView;
import spark.template.handlebars.HandlebarsTemplateEngine;

import java.util.HashMap;
import java.util.Map;

import static spark.Spark.get;
import static spark.Spark.port;
import static spark.Spark.post;

public class WebMain {

    private static RacingGame racingGame;
    public static void main(String[] args) {

        port(8080);

        get("/helloworld", (req, res) -> {
            return render(null, "/index.html");
        });

        post("/name", (req, res) -> {
            String[] carNames = req.queryParams("names").split(" ");
            racingGame  = new RacingGame(InputView.makeCars(carNames));

            Map<String, Object> model = new HashMap<>();
            model.put("carNames", carNames);
            return render(model,"/game.html");
        });

        get("/result", (req, res) -> {
            int tryNo = Integer.valueOf(req.queryParams("turn"));
            GameResult result = null;

            for(int i = 0; i < tryNo; i++) {
                result = racingGame.choiceMovingCar();
            }

            Map<String, Object> model = new HashMap<>();
            model.put("winnerNames",result.getWinnerNames());
            model.put("cars",result.getCars());

            return render(model,"/result.html");
        });
    }

    public static String render(Map<String, Object> model, String templatePath) {
        return new HandlebarsTemplateEngine().render(new ModelAndView(model, templatePath));
    }
}
