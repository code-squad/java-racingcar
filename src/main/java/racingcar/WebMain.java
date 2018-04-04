package racingcar;

import racingcar.domain.Car;
import racingcar.domain.RacingGame;
import spark.ModelAndView;
import spark.template.handlebars.HandlebarsTemplateEngine;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.IntStream;
import static java.util.stream.Collectors.*;

import static spark.Spark.*;

public class WebMain {
    private static RacingGame racingGame;

    public static void main(String[] args) {
        port(8080);

        get("/", (request, response) ->
               render(null,"/index.html"));

        post("/name", (request, response) -> {
            racingGame = new RacingGame(request.queryParams("names").split(" "));
            return render(null, "/game.html");
        });

        get("/result", (request, response) -> {
            racingGame.play();

            Map<String, Object> model = new HashMap<>();
            model.put("turnResults", IntStream.range(0, Integer.parseInt(request.queryParams("turn")))
                    .mapToObj(turn -> racingGame.play())
                    .collect(toList()));
            model.put("winners", racingGame.getWinner());
            return render(model, "/result.html");
        });
    }

    private static String render(Map<String, Object> model, String templatePath) {
        return new HandlebarsTemplateEngine().render(new ModelAndView(model, templatePath));
    }
}
