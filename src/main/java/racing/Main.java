package racing;

public class Main {

    public static void main(String[] arg){
        int number = RacingInput.inputCars();
        int trials = RacingInput.inputTrials();

        RacingGame game = new RacingGame(number);

        game.readyRacing();

        for(int i = 0; i < trials; i++){
            RacingResult.printResult(game.moveAll());
        }
    }
}
