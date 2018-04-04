import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        int numCar = RacingInput.readNumCar();
        int numCircuit = RacingInput.readNumCircuit();

        RandomRule rule = new RandomRule(true);
        Racing racing = new Racing(numCar,numCircuit);
        for(int i=0; i<numCircuit; i++){
            RacingView.printStatus(racing.move(rule));
        }
    }
}
