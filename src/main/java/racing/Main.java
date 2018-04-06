package racing;

public class Main {

    public static void main(String[] arg){
        String driverNames = RacingInput.inputCars();
        int trials = RacingInput.inputTrials();

        RacingGame game = new RacingGame(driverNames);

        game.readyRacing();

        for(int i = 0; i < trials; i++){
            RacingResult.printResult(game.moveAll());
        }

        RacingResult.printBestDriver(game.getBestDrivers());
    }
}
