import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        int numCar = RacingInput.readNumCar();
        int numCircuit = RacingInput.readNumCircuit();


        Racing racing = new Racing(numCar,numCircuit);
        racing.start();
        //TODO: 구현
        //RacingView.replay(racing.getRecords());
    }



}
