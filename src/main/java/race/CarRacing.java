package race;

public class CarRacing {

    public static Car[] makeCar(String[] nameArr, Car[] car) {
        for (int i = 0; i < car.length; i++) {
            car[i] = new Car(nameArr[i]);
        }
       return car;
    }

    public static void transport(int tryCount, Car[] car) {
        for (int i = 0; i < tryCount; i++) {
            move(car);
        }
    }

    public static void move(Car[] car) {
        for (int j = 0; j < car.length; j++) {
            car[j].go();
        }
    }

    public static void valuePrint(Car[] car) {
        for (int i = 0; i < car.length; i++) {
           ResultView.namePrint(car[i].getName());
           ResultView.dashPrint(car[i].getPosition());
        }
    }

    public static int maxSet(Car[] car) {
        int max = -1;
        for (int i = 0; i < car.length; i++) {
            if (max < car[i].getPosition())
                max = car[i].getPosition();
        }
        return max;
    }

    public static String findVictory(int max,Car[] car){
        String victory = "";
        for (int i = 0; i < car.length; i++) {
            if (max == car[i].getPosition())
                victory += car[i].getName() + ",";
        }
        return victory;
    }
}
