import racingGame.Car;
import racingGame.GameHelperUtil;
import racingGame.RacingGame;
import racingGame.ResultView;
import spark.ModelAndView;
import spark.template.handlebars.HandlebarsTemplateEngine;

import java.util.*;

import static spark.Spark.get;
import static spark.Spark.port;
import static spark.Spark.post;

public class Main {

    public static void main(String[] args) {

        /*Scanner scanner = new Scanner(System.in);
        System.out.println("경주할 자동차 이름을 입력하세요(이름은 쉼표(,)를 기준으로 구분).");
        String carName = scanner.nextLine();
        System.out.println("시도할 회수는 몇 회인가요?");
        int time = scanner.nextInt();

        RacingGame racingGame = new RacingGame(time,carName);

        ResultView resultView = new ResultView();

        racingGame.runGame();

        resultView.printResult(racingGame);*/

        port(8080);

        get("/", (req, res) -> {
            Map<String, Object> model = new HashMap<>();
            model.put("name", "pobi");
            return render(model, "/index.html");
        });

        post("/name", (req,res) -> {
            Map<String, Object > model = new HashMap<>();
            String carNames = req.queryParams("names");
            List<Car> cars = GameHelperUtil.getCarNames(carNames);
            req.session(true);
            req.session().attribute("names",carNames);

            model.put("cars", cars);

            return render(model,"/game.html");
        });

        get("/result",(req,res) -> {

            Map<String,Object> model = new HashMap<>();
            int time = Integer.valueOf(req.queryParams("turn"));
            String carNames = req.session().attribute("names");
            RacingGame racingGame = new RacingGame(time,carNames);
            racingGame.runGame();
            List<String> results = new ArrayList<>();


            model.put("results",racingGame.getResult());
            return render(model,"result.html");
        });

    }

    private static Object render(Map<String, Object> model, String templatePath) {
        return new HandlebarsTemplateEngine().render(new ModelAndView(model, templatePath));
    }
}
