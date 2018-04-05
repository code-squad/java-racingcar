import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        String[] carNames = RacingInput.setCarNames();
        int numCircuit = RacingInput.readNumCircuit();

        Racing race = new Racing(carNames, numCircuit);

        RandomRule rule = new RandomRule(true);
        for(int i=0; i<numCircuit; i++){
            RacingView.printStatus(race.move(rule));
        }

        RacingView.printWinner(race.getWinner());
    }
}
