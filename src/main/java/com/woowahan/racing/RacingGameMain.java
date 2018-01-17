package com.woowahan.racing;

import spark.ModelAndView;
import spark.template.handlebars.HandlebarsTemplateEngine;

import java.util.*;

import static spark.Spark.get;
import static spark.Spark.post;
import static spark.Spark.staticFiles;

public class RacingGameMain {

	public static void main(String[] args) {
		staticFiles.location("/templates");

		List<String> names = new ArrayList<>();

		post("/game", (req, res) -> {
			for (String name : req.queryParams("names").split(" ")) {
				names.add(name);
			}

			Map<String, Object> model = new HashMap<>();
			model.put("names", names);

			return render(model, "game.html");
		});

		get("/start", (req, res) -> {
			int time = Integer.parseInt(req.queryParams("time"));
			RacingGame racingGame = new RacingGame(names, time);
			racingGame.start();

			List<Car> cars = racingGame.getCars();

			Map<String, Object> model = new HashMap<>();
			model.put("cars", cars);

			List<Car> winners = RacingGame.getMatchPositionCar(cars, RacingGame.getMaxPosition(cars));
			model.put("winners", racingGame.getCarsName(winners));

			return render(model, "result.html");
		});
	}

	public static String render(Map<String, Object> model, String templatePath) {
		return new HandlebarsTemplateEngine().render(new ModelAndView(model, templatePath));
	}

}
