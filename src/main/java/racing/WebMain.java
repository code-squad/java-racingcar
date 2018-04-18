package racing;

import racing.domain.Car;
import racing.view.RacingResult;
import spark.ModelAndView;
import spark.template.handlebars.HandlebarsTemplateEngine;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static spark.Spark.get;
import static spark.Spark.port;
import static spark.Spark.post;

public class WebMain {
    public static void main(String[] args){
        RacingGame game = new RacingGame();


        port(8080);

        get("/", (req,resp) ->
           new ModelAndView(new HashMap<>(),"index.html"), new HandlebarsTemplateEngine()
        );

        post("/name", (req,resp) -> {
            Map<String, Object> map = new HashMap<>();
            String names = req.queryParams("names");
            game.readyRacing(names);

            String[] driverNames = names.split(",");

            map.put("names", driverNames);

            return new ModelAndView(map,"game.html");
        }, new HandlebarsTemplateEngine());

        get("/result", (req, resp) -> {
            Map<String, Object> map = new HashMap<>();
            int turn = Integer.parseInt(req.queryParams("turn"));

            List<Car> cars = game.moveAll();
            for(int i = 1; i < turn; i++){
                game.moveAll();
            }

            List<String> drivers = new ArrayList<>();

            cars.forEach(car -> {
                drivers.add(RacingResult.printCarResult(car));
            });

            map.put("drivers", drivers);
            map.put("result", RacingResult.printBestDriver(game.getBestDrivers()));

            return new ModelAndView(map,"result.html");
        }, new HandlebarsTemplateEngine());
    }
}
