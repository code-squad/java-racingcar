package racingcar;

import static spark.Spark.port;
import static spark.Spark.post;
import static spark.Spark.get;
import static spark.Spark.staticFiles;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;


import spark.ModelAndView;
import spark.template.handlebars.HandlebarsTemplateEngine;

public class Race {
	Cars cars;
	private void startGame() {
		port(8080);
		
		get("/", (req, res) -> {
			return render(new HashMap<>(), "index.html");
		});
		
		Map<String, Object> model = new HashMap<>();
		post("/name", (req, res) -> {
			cars = new Cars(req.queryParams("names").split(" "));
			model.put("cars", cars.getCars());

			return render(model, "game.html");
		});
		
		post("/result", (req, res) -> {
			cars.moveCars(Integer.parseInt(req.queryParams("turn")));
			return render(model, "result.html");
		});
	}
 
	
	public static String render(Map<String, Object> model, String templatePath) {
		return new HandlebarsTemplateEngine().render(new ModelAndView(model, templatePath));
	}
	public static void main(String[] args) {
		Race race = new Race();
		race.startGame();
	}
}
