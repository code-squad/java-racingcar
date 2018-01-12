package car;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import spark.ModelAndView;
import spark.template.handlebars.HandlebarsTemplateEngine;

import static spark.Spark.*;

public class MainController {
	public static void main(String[] args) {
		ArrayList<Car> cars = new ArrayList<Car>();
		port(8080);
		
		get("/", (req, res) -> {
			return render(new HashMap<> (), "index.html");
		});
		
		post("/name", (req, res) -> {
			String inputName = req.queryParams("names");
			ArrayList<String> carNameList = new ArrayList<String>(Arrays.asList(RacingCar.splitName(inputName)));
			for (String name : carNameList) {
				cars.add(new Car(name));
			}
			Map<String, Object> model = new HashMap<>();
			model.put("cars", cars);
			return render(model, "game.html");
		});
		
		get("/result", (req, res) -> {
			int inputNum = Integer.parseInt(req.queryParams("turn"));
			
			for (int i = 0; i < inputNum; i++) {
				RacingCar.startRace(cars);
			}
			
			Map<String, Object> model = new HashMap<>();
			model.put("cars", cars);
			return render(model, "result.html");
//			int biggest = RacingCar.findBiggest(carStatus);
//			ResultView.printWinner(biggest, cars);
		});
	}
	
	public static String render(Map<String, Object> model, String templatePath) {
	    return new HandlebarsTemplateEngine().render(new ModelAndView(model, templatePath));
	}
}
