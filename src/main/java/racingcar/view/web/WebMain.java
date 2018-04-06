package racingcar.view.web;

import racingcar.domain.GameResult;
import racingcar.domain.RacingGame;
import racingcar.view.utils.StringHelper;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static spark.Spark.get;
import static spark.Spark.post;

/**
 * @author sangsik.kim
 */
public class WebMain {
    private static RacingGame racingGame;
    private static Map<String, Object> model = new HashMap<>();

    public static void main(String[] args) {
        get("/", (req, res) -> ViewResolver.render("/index.html"));

        post("/name", (req, res) -> {
            List<String> names = ParameterParser.getNames(req);
            if (names.get(0).isEmpty()) {
                res.redirect("/");
            }

            racingGame = new RacingGame(ParameterParser.getNames(req));
            model.put("names", names);

            return ViewResolver.render(model, "/game.html");
        });

        get("/result", (req, res) -> {
            Integer count = ParameterParser.getRunCount(req);
            GameResult gameResult = new GameResult();
            List<List<String>> progress = new ArrayList<>();

            for (int i = 0; i < count; i++) {
                gameResult = racingGame.run();
                progress.add(StringHelper.createProgressString(gameResult.getRecords(), "_"));
            }

            model.put("progress", progress);
            model.put("winners", StringHelper.createWinnersString(gameResult.getWinners()));

            return ViewResolver.render(model, "/result.html");
        });
    }
}
