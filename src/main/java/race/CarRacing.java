package race;

public class CarRacing {

    private static Car[] car;

    private static Car[] makeCar(String[] nameArr, Car[] car) {
        for (int i = 0; i < car.length; i++) {
            car[i] = new Car(nameArr[i]);
        }
       return car;
    }

    private static void transport(int tryCount, Car[] car) {
        for (int i = 0; i < tryCount; i++) {
            move(car);
        }
    }
    private static void move(Car[] car) {
        for (int j = 0; j < car.length; j++) {
            car[j].go();
        }
    }

    private static void valuePrint(Car[] car) {
        for (int i = 0; i < car.length; i++) {
           ResultView.namePrint(car[i].getName());
           ResultView.dashPrint(car[i].getPosition());
        }
    }

    private static void maxSet(Car[] car) {
        for (int i = 0; i < car.length; i++) {
            car[i].maxPosition();
        }
    }

    private static String victory(Car[] car) {
        String champion = "";
        for (int i = 0; i < car.length; i++) {
            champion += car[i].victory();
        }
        return champion;
    }

    public static Car[] getCarArray(){
        return car;
    }

    public static void main(String[] args) {
        String[] nameArr = InputView.inputName().split(",");
        int tryCount = InputView.inputCount();
        car = new Car[nameArr.length];
        car = makeCar(nameArr, car);
        transport(tryCount, car);
        valuePrint(car);
        maxSet(car);
        ResultView.victory(victory(car));
    }
}
