public class Main {

    public static void main(String[] args) {
        //InputView 클래스에서 가져온 후 이름 나누기
        String[] names = InputView.name().split(",");
        //InputView 클래스에서 가져온 자동차 이동 횟수
        int move = InputView.carMove();
        //GameInfo 객체
        GameInfo[] cars = new GameInfo[names.length];
        for (int i = 0; i < names.length; i++) {
            //차 객체 만들기.
            cars[i] = new GameInfo(names[i]);
        }
        GameInfo.play(move, cars);

        //ResultView 객체
        ResultView result = new ResultView();
        result.printResult(cars);
        result.checkWinner(cars);
    }
}
