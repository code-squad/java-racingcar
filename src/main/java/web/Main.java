package web;

import org.apache.commons.lang3.ArrayUtils;
import org.apache.commons.lang3.StringUtils;
import racing.RacingResult;
import racing.RacingResultUtils;
import racing.RandomRacingGame;
import spark.ModelAndView;
import spark.Request;
import spark.template.handlebars.HandlebarsTemplateEngine;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static spark.Spark.get;
import static spark.Spark.port;
import static spark.Spark.post;

public class Main {

    private static final String NAME = "NAME";

    public static void main(String[] args) {
        port(8080);

        get("/", (req, res) -> render(Collections.emptyMap(), "/index.html"));

        post("/name", (req, res) -> {
            String[] carNames = StringUtils.split(req.queryParams("names"), ' ');

            req.session().attribute(NAME, carNames);
            return render(Collections.singletonMap("names", carNames), "/game.html");
        });

        post("/result", (req, res) -> {
            checkRequestParameter(req);
            String[] names = req.session().attribute(NAME);
            Map<String, Object> model = new HashMap<>();

            if (checkRequestParameter(req) && !ArrayUtils.isEmpty(names)) {
                int turn = Integer.valueOf(req.queryParams("turn"));

                RandomRacingGame randomRacingGame = new RandomRacingGame(names, turn);

                List<RacingResult> results = randomRacingGame.doRacing();
                String winners = RacingResultUtils.getBestCarNames(results);

                model.put("results", results);
                model.put("winners", winners);
            }

            return render(model, "/result.html");
        });
    }

    private static boolean checkRequestParameter(Request req) {
        String turnString = req.queryParams("turn");
        return !StringUtils.isEmpty(turnString) && StringUtils.isNumeric(turnString)
            && Integer.valueOf(turnString) > 0;
    }

    private static String render(Map<String, Object> model, String templatePath) {
        return new HandlebarsTemplateEngine().render(new ModelAndView(model, templatePath));
    }
}
