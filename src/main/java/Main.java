public class Main {

    public static void main(String[] args) {
        //InputView 클래스에서 가져온 후 이름 나누기
        String[] names = InputView.name().split(",");
        //InputView 클래스에서 가져온 자동차 이동 횟수
        int move = InputView.carMove();

        Car[] cars = GameInfo.cars(names.length, names);
        GameInfo.play(move, cars);

        // ResultView 객체
        ResultView.printResult(cars);
        ResultView.checkWinner(cars);
    }
}

