package game.racingGame;

import java.util.List;

public class View {
    public static void getResult(RacingGame racingGame){

        List<Car> cars = racingGame.getCars();

        for (Car car: cars){
            printName(car);
            printPosition(car);
        }

        List<Car> winners = racingGame.pickWinners();
        for (Car car: winners){
            printName(car);
        }
    }

    private static void printName(Car car) {
        System.out.print(car.getName() + " ");
    }

    private static void printPosition(Car car){
        for (int i = 0; i < car.getPosition(); i++) {
            System.out.print("-");
        }
        System.out.println();
    }
}
