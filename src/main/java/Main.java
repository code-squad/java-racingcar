import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        Racing racing = new Racing();
        racing.setNumCar(3);
        racing.setNumCircuit(5);
        System.out.println(racing.getNumCar());
        System.out.println(racing.getNumCircuit());
        racing.start();

    }



}
