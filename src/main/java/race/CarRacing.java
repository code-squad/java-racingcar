package race;

import java.util.*;

public class CarRacing {

    private static int findMax(Car[] car) {
        int max = -1;
        for (int i = 0; i < car.length; i++) {
            max = max < car[i].getPosition()? car[i].getPosition() : max;
        }
        return max;
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] nameArr = InputView.inputName(scan).split(",");
        Car[] car = new Car[nameArr.length];
        int tryCount = InputView.inputCount(scan);

        for (int i = 0 ; i< car.length ; ++i) {
            car[i] = new Car(nameArr[i], tryCount);
            ResultView.namePrint(car[i].getName());
            ResultView.dashPrint(car[i].getPosition());
        }

        ResultView.whoVictory(car,findMax(car));
    }
}
