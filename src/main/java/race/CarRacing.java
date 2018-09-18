package race;

import java.util.ArrayList;

public class CarRacing {
    private static Car[] car;


    public CarRacing(int length) {
        car = new Car[length];
    }

    public static Car[] makeCar(String[] nameArr) {
        for (int i = 0; i < car.length; i++) {
            car[i] = new Car(nameArr[i]);
        }
       return car;
    }

    public static void transport(int tryCount) {
        for (int i = 0; i < tryCount; i++) {
            move();
        }
    }

    public static void move() {
        for (int j = 0; j < car.length; j++) {
            car[j].go();
        }
    }

    public static void valuePrint() {
        for (int i = 0; i < car.length; i++) {
           ResultView.namePrint(car[i].getName());
           ResultView.dashPrint(car[i].getPosition());
        }
    }

    public static int maxSet() {
        int max = -1;
        for (int i = 0; i < car.length; i++) {
            max = car[i].maxSet(max);
        }
        return max;
    }

    public static ArrayList<String> result(int max) {
        ArrayList<String> champion = new ArrayList<>();
        for (int i = 0; i < car.length; i++) {
            if(max == car[i].getPosition())
                champion.add(car[i].getName());
        }
        return champion;
    }
}
