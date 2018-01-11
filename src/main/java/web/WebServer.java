package web;

import static spark.Spark.get;
import static spark.Spark.port;
import static spark.Spark.post;

import car.Car;
import game.RacingGame;
import game.RacingGameCarFactory;
import game.RacingGameRuleGenerator;
import game.Result;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import spark.ModelAndView;
import spark.template.handlebars.HandlebarsTemplateEngine;

public class WebServer {

  static List<Car> cars;

  public static void main(String[] args) {
    port(8080);

    get("/", (req, res) -> {
      return render(null, "/index.html");
    });

    post("/name", (req, res) -> {
      String[] names = req.queryParams("names").split(" ");
      cars = RacingGameCarFactory.createCars(names);

      Map<String, Object> model = new HashMap<>();
      model.put("names", names);
      return render(model, "/game.html");
    });

    post("/result", (req, res) -> {
      int times = Integer.parseInt(req.queryParams("turn"));

      RacingGame racingGame = new RacingGame(cars, times);
      RacingGameRuleGenerator gameRuleGenerator = () -> new Random().nextInt(10);
      List<Result> results = racingGame.racing(gameRuleGenerator);

      Map<String, Object> model = new HashMap<>();
      model.put("results", results);
      return render(model, "/result.html");
    });
  }

  public static String render(Map<String, Object> model, String templatePath) {
    return new HandlebarsTemplateEngine().render(new ModelAndView(model, templatePath));
  }
}
