package racingcar;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

/**
 * 자동차 경주 게임 1단계
 *
 */
public class RacingCar {
    private static List<Car> cars = new ArrayList<>();
    private static final int RANDOM_MAX_NUMBER = 10;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("자동차 대수를 입력하세요");
        int carValue = sc.nextInt();

        System.out.println("시도할 횟수는 몇회인가요?");
        int tryNumber = sc.nextInt();

        // make Cars
        for(int i =1; i <= carValue; i++){
            cars.add(new Car());
        }

        // cars move
        move(tryNumber);

        // print Console
        printConsole(cars, tryNumber);
    }

    public static List<Car> move(int tryNumber){
        for(Car car : cars){
            car.setPosition(0);
            carMove(tryNumber, car);
        }
        return cars;
    }

    public static void carMove(int tryNumber, Car car){
        for(int i=0; i < tryNumber; i++ ){
            Random random = new Random();
            int randomNumber = random.nextInt(RANDOM_MAX_NUMBER);
            car.move(randomNumber);
        }
    }

    public static void printConsole(List<Car> cars, int tryNumber){
        for(int j=1; j<= tryNumber; j++){
            for(Car car2 : cars){
                printResult(car2, tryNumber);
            }
            System.out.println("");
        }
    }

    public static void printResult(Car car2, int tryNumber){
        for(int i=0; i < car2.getPosition(); i++){
            System.out.print("-");
        }
        System.out.println("");
    }
}
