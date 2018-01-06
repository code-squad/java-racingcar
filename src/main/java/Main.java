import car.CarManager;

import java.util.Scanner;

public class Main {
    public static void main(String [] args){
        CarManager carManager = new CarManager();
        Scanner scan = new Scanner(System.in);
        System.out.println("자동차 대수는 몇 대인가?");
        int carSize = scan.nextInt();

        carManager.createCarBySize(carSize);

        System.out.println("시도할 회수는 몇 회 인가요?");
        int tryNumber = scan.nextInt();
        carManager.moveCars(tryNumber);
    }


}
