package will;

import static spark.Spark.post;
import static spark.Spark.staticFiles;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import spark.ModelAndView;
import spark.template.handlebars.HandlebarsTemplateEngine;

public class CarRacing {
	static List<Car> cars;
	
	public static void main(String[] args) {
		staticFiles.location("/static");
		
		post("/cars", (req, res) -> {
			cars = Car.createCars(req.queryParams("names"));
			Map<String, Object> model = new HashMap<>();
			model.put("cars", cars);
			return render(model, "game.html");
		});
		
		
		post("/result", (req, res) -> {
			String turnStr = req.queryParams("turn");
			int turn = Integer.parseInt(turnStr);
			for (int i = 0; i < turn; i++) {
				Car.runCars(cars);
			}
			Map<String, Object> model = new HashMap<>();
			model.put("cars", cars);
			return render(model, "result.html");
		});
	}
	
	public static String render(Map<String, Object> model, String templatePath) {
	    return new HandlebarsTemplateEngine().render(new ModelAndView(model, templatePath));
	}
}
