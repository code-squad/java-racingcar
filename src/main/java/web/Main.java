package web;

import org.apache.commons.lang3.StringUtils;
import racing.Car;
import racing.RacingResult;
import racing.RacingResultUtils;
import racing.RandomMoveStrategy;
import racing.RandomRacingGame;
import spark.ModelAndView;
import spark.template.handlebars.HandlebarsTemplateEngine;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.IntStream;

import static spark.Spark.get;
import static spark.Spark.port;
import static spark.Spark.post;

public class Main {

    private static Car[] cars;

    public static void main(String[] args) {
        port(8080);

        get("/", (req, res) -> render(Collections.emptyMap(), "/index.html"));

        post("/name", (req, res) -> {
            String names = req.queryParams("names");

            if (StringUtils.isEmpty(names)) {
                // 예외 처리
            }

            String[] nameArray = StringUtils.split(names, ' ');

            cars = new Car[nameArray.length];
            IntStream.range(0, nameArray.length)
                     .forEach(i -> cars[i] = new Car(RandomMoveStrategy.getInstance(), nameArray[i]));

            return render(Collections.singletonMap("cars", cars), "/game.html");
        });

        post("/result", (req, res) -> {
            String turnValue = req.queryParams("turn");

            if (!StringUtils.isNumeric(turnValue)) {

            }


            int turn = Integer.valueOf(turnValue);

            RandomRacingGame randomRacingGame = new RandomRacingGame(cars, turn);

            List<RacingResult> results = randomRacingGame.doRacing();
            String winners = RacingResultUtils.getBestCarNames(results);

            Map model = new HashMap();
            model.put("results", results);
            model.put("winners", winners);

            return render(model, "/result.html");
        });


    }

    public static String render(Map<String, Object> model, String templatePath) {
        return new HandlebarsTemplateEngine().render(new ModelAndView(model, templatePath));
    }
}
