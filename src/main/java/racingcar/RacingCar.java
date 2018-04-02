package racingcar;

public class RacingCar {

    PlayRounds playRounds;
    ResultView resultView;
    InputView inputView;


    public void startRacing(){

        inputView = new InputView();
        UserInput userInput = inputView.getUserInput();

        isValidParameter(userInput.getCarCount(), userInput.getRoundCount());

        int carCountNumber = Integer.parseInt(userInput.getCarCount());
        int roundCountNumber = Integer.parseInt(userInput.getRoundCount());

        PlayRounds playRounds = new PlayRounds(carCountNumber);
        resultView = new ResultView();

        for(int i=0; i<roundCountNumber; i++){
            playRounds.playSingleRounds();
            resultView.printRoundState(playRounds.getPayerCarArrayList());
            System.out.println();
        }

    }

    public void isValidParameter(String paramCarCount, String paramRoundCount) {
        if(paramCarCount == null || paramCarCount.trim().isEmpty() || Integer.parseInt(paramCarCount) < 1) {
            throw new IllegalArgumentException();
        }

        if(paramRoundCount == null || paramRoundCount.trim().isEmpty() || Integer.parseInt(paramRoundCount) < 1) {
            throw new IllegalArgumentException();
        }
    }

    public static void main(String[] args0){
        RacingCar racingCar = new RacingCar();

        racingCar.startRacing();
    }
}
