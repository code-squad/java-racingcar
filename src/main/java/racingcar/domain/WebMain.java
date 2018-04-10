package racingcar.domain;

import racingcar.view.WebView;

import static spark.Spark.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class WebMain {


    public static void main(String[] args) {
        port(8080);

        WebView webView = new WebView();

        UserInput userInput = new UserInput();
        int curRound;

        get("/", (req, res)->{
            Map<String, Object> model = new HashMap<>();
            return webView.render(model, "/index.html");
        });

        post("/name", (req, res)->{
            String attributeNames = req.queryParams("names");

            String[] names = attributeNames.split(" " );
            userInput.setPlayers(names);

            Map<String, Object> model = new HashMap<>();
            model.put("names", names);

            return webView.render(model, "/game.html");
        });

        get("/result", (req, res)->{
            String rounds = req.queryParams("turn");
            userInput.setRoundCount(Integer.parseInt(rounds));

            RacingCar racingCar = new RacingCar();

            PlayRounds playRounds = racingCar.startRacing(userInput);

            List<PlayerCar> playerCars = new ArrayList<>();
            for(int i=0; i<userInput.getRoundCount(); i++){
                playerCars = playRounds.playSingleRounds();
            }

            Map<String, Object> model = new HashMap<>();

            model.put("playerCars", playerCars);
            model.put("winners", playRounds.getWinners());


            return webView.render(model, "/result.html");
        });


    }
}
