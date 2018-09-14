package racingcar;

public class GameLoader {
    public static void main(String[] args) {
        InputView inputView = new InputView(System.in);
        RacingGame game = new RacingGame();
        game.initCars(inputView.getInputName());
        game.run(inputView.getInputTime());
        OutputView outputView = new OutputView(game.returnResult(), game.returnWinner());
        outputView.print();
    }
}