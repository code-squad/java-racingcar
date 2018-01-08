import car.CarManager;

import java.util.Scanner;

public class Main {
    public static void main(String [] args){

        Scanner scan = new Scanner(System.in);
        System.out.println("자동차 대수는 몇 대인가?");
        int carSize = scan.nextInt();
        System.out.println("시도할 회수는 몇 회 인가요?");
        int tryNumber = scan.nextInt();

        CarManager carManager = new CarManager(carSize, tryNumber);
        carManager.moveCars();
        carManager.printCars();
    }
}
