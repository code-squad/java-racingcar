public class Main {

    public static void main(String[] args) {
        String[] names = InputView.name().split(",");
        int move = InputView.carMove();
        Car[] cars = GameInfo.cars(names.length, names);
        GameInfo.play(move, cars);
        ResultView.printResult(cars);
        ResultView.checkWinner(cars);
    }
}

