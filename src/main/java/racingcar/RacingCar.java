package racingcar;

import java.util.List;

public class RacingCar {

    PlayRounds playRounds;
    ResultView resultView;
    InputView inputView;


    public void startRacing(){

        inputView = new InputView();
        UserInput userInput = inputView.getUserInput();

        String[] players = userInput.getPlayers();
        int roundCount = userInput.getRoundCount();

        PlayRounds playRounds = new PlayRounds(players);
        resultView = new ResultView();

        for(int i=0; i<roundCount; i++){
            playRounds.playSingleRounds();
            resultView.printRoundState(playRounds.getPlayerCars());
            System.out.println();
        }
        resultView.printWinners(playRounds.getWinners());

    }


    public static void main(String[] args0){
        RacingCar racingCar = new RacingCar();

        racingCar.startRacing();
    }
}
