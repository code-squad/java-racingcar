package racingCar;

import java.util.Random;
import java.util.Scanner;

public class RacingCar {

    private int time;
    private int[] carPositions;
    private static int carNumbers;


    public static void main(String[] args) {
        RacingCar racingCar = new RacingCar();
        racingCar.setup();
        racingCar.move(carNumbers);
    }

    public void setup() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("자동차 대수는 몇대입니까.");
        this.carNumbers = scanner.nextInt();
        carPositions = new int[carNumbers];

        System.out.println("시도할 횟수는 몇회입니까?.");
        this.time = scanner.nextInt();
   }

    public int[] move(int carNumber) {
        Random random = new Random();

        for (int tryCount = 1; tryCount <=time; tryCount++) {
            makeRandomNumber(carNumber, random);
            System.out.println(" " );
        }
        return carPositions;
    }

    private void makeRandomNumber(int carNumbers, Random random) {
        for (int startCarNumber = 0; startCarNumber < carNumbers ; startCarNumber++) {
            carPositions[startCarNumber] += nextMoveAndStop(random.nextInt(10));
            makeBar(carPositions[startCarNumber]);
        }
    }


    public String makeBar(int currentPostion) {

        String bar = "";
        for (int startPostion = 1; startPostion <= currentPostion ; startPostion++) {
            bar += "-";
        }
        System.out.println("car" + bar);
        return bar;
    }

    public int nextMoveAndStop(int i) {
         return   i > 4 ? 1 : 0;
    }

}
