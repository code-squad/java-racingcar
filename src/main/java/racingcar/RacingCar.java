package racingcar;

public class RacingCar {

    PlayRounds playRounds;
    ResultView resultView;
    InputView inputView;


    public void startRacing(){

        inputView = new InputView();
        UserInput userInput = inputView.getUserInput();

        int carCount = userInput.getCarCount();
        int roundCount = userInput.getRoundCount();

        PlayRounds playRounds = new PlayRounds(carCount);
        resultView = new ResultView();

        for(int i=0; i<roundCount; i++){
            playRounds.playSingleRounds();
            resultView.printRoundState(playRounds.getPlayerCars());
            System.out.println();
        }

    }


    public static void main(String[] args0){
        RacingCar racingCar = new RacingCar();

        racingCar.startRacing();
    }
}
