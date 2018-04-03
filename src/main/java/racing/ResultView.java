package racing;

public class ResultView {

    private static void print(MoveResult result) {
        for (String position : result.distances) {
            System.out.println(position);
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int carNo = InputView.getCarNo();
        int tryNo = InputView.getTryNo();

        RacingGame racingGame = new RacingGame(carNo);
        for(;tryNo > 0; tryNo--) {
            MoveResult result = racingGame.move();
            ResultView.print(result);
        }
    }
}
