package racingcar.domain;

import racingcar.view.InputView;
import racingcar.view.ResultView;

import java.util.List;

public class RacingCar {

    PlayRounds playRounds;


    public PlayRounds startRacing(UserInput userInput){
        String[] players = userInput.getPlayers();

        PlayRounds playRounds = new PlayRounds(players);
        return playRounds;

//        for(int i=0; i<roundCount; i++){
//            playRounds.playSingleRounds();
//            System.out.println();
//        }

    }


    public static void main(String[] args0){
        InputView inputView = new InputView();
        ResultView resultView = new ResultView();
        RacingCar racingCar = new RacingCar();

        UserInput userInput = inputView.getUserInput();
        PlayRounds playRounds = racingCar.startRacing(userInput);

        List<PlayerCar> playerCars;
        for(int i=0; i<userInput.getRoundCount(); i++){
            playerCars = playRounds.playSingleRounds();
            resultView.printRoundState(playerCars);
            System.out.println();
        }

        resultView.printWinners(playRounds.getWinners());



    }
}
