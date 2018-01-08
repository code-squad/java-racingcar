package game.racingGame;

import java.util.List;

public class View {
    public static void getResult(List<Car> cars){
        for (Car car: cars){
            printPosition(car.getPosition());
        }
    }

    private static void printPosition(Integer value){
        for (int i = 0; i < value; i++) {
            System.out.print("-");
        }
        System.out.println();
    }
}
