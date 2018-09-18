package race;

public class RacingMain {
    public static void main(String[] args) {
        String[] nameArr = InputView.inputName().split(",");
        int tryCount = InputView.inputCount();
        Car[] car = new Car[nameArr.length];
        CarRacing.makeCar(nameArr, car);
        CarRacing.transport(tryCount, car);
        CarRacing.valuePrint(car);
        int max = CarRacing.maxSet(car);
        ResultView.victory(CarRacing.findVictory(max,car));
    }
}
