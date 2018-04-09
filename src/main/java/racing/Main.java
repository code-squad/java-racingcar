package racing;

public class Main {

    public static void main(String[] arg){
        String driverNames = RacingInput.inputCars();
        int trials = RacingInput.inputTrials();

        RacingGame game = new RacingGame();

        game.readyRacing(driverNames);

        for(int i = 0; i < trials; i++){
            RacingResult.printResult(game.moveAll());
        }

        RacingResult.printBestDriver(game.getBestDrivers());
    }
}
