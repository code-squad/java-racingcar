package controller;
import static spark.Spark.get;
import static spark.Spark.port;
import static spark.Spark.post;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import model.Car;
import model.Racing;
import model.StringProcess;
import spark.ModelAndView;
import spark.template.handlebars.HandlebarsTemplateEngine;

public class Main {
	static Racing racing;
	static List<Car> cars;
	public static void main(String[] args) {
		port(8080);
		get("/", (req, res) -> {
			return render(new HashMap<>(), "index.html");
		});
		cars = new ArrayList<>();
		post("/name", (req, res) -> {
			List<String> carNames = StringProcess.parseInputString(req.queryParams("names"));
			for(String name : carNames) {
				cars.add(new Car(name));
			}
			return render(new HashMap<>(), "game.html");
		});
		racing = new Racing(cars);
		post("/result", (req, res) -> {
			String count = req.queryParams("turn");
			for(int i=0; i < Integer.parseInt(count); i++) {
				racing.doOneTry();
			}
			cars= racing.getCars();
			Map<String, Object> model = new HashMap<>();
			model.put("cars", cars);	
			return render(model, "result.html");
		});
	}

	public static String render(Map<String, Object> model, String templatePath) {
        return new HandlebarsTemplateEngine().render(new ModelAndView(model, templatePath));
    }
}
