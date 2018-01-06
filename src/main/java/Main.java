import java.util.HashMap;
import java.util.Map;

import car.CarRacing;
import spark.ModelAndView;
import spark.template.handlebars.HandlebarsTemplateEngine;

import static car.RacingUtils.SPACE;
import static spark.Spark.get;
import static spark.Spark.port;
import static spark.Spark.post;

/**
 * Created by youngjae on 2018. 1. 6..
 */
public class Main {

    private static final String NAMES = "names";
    private static final String CAR_RACING = "CAR_RACING";

    public static void main(String[] args) {
        port(8080);

        get("/", (req, res) -> render(null, "/index.html"));

        post("/name", (req, res) -> {
            String names[] = req.queryParams(NAMES).split(SPACE);

            CarRacing carRacing = CarRacing.readyForRacing();
            carRacing.createCarsByName(names);
            req.session().attribute(CAR_RACING, carRacing);

            Map<String, Object> model = new HashMap<>();
            model.put(NAMES, names);
            return render(model, "/game.html");
        });

        post("/result", (req, res) -> {
            int tryCount = Integer.parseInt(req.queryParams("turn"));
            CarRacing carRacing = req.session().attribute(CAR_RACING);
            carRacing.setTryCount(tryCount);

            Map<String, Object> model = new HashMap<>();
            model.put("cars", carRacing.startRacing());
            return render(model, "/result.html");
        });
    }

    /*private static void step2() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("경주할 자동차 이름을 입력하세요(이름은 쉼표(,)를 기준으로 구분).");
        String names[] = scanner.nextLine().split(REGEX);
        System.out.println("시도할 회수는 몇 회 인가요?");
        int tryCount = scanner.nextInt();
        CarRacing carRacing = CarRacing.readyForRacing();
        carRacing.createCarsByName(names);
        carRacing.setTryCount(tryCount);
        List<Car> cars = carRacing.startRacing();
        System.out.println("실행 결과");
        printRacingUi(cars);
        System.out.println(resultFormatting(carRacing.getWinners()));
    }*/

    public static String render(Map<String, Object> model, String templatePath) {
        return new HandlebarsTemplateEngine().render(new ModelAndView(model, templatePath));
    }

}