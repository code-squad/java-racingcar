import java.util.ArrayList;

public class Main {
	public static void main(String[] args) {
		InputView inputView = new InputView();
		ArrayList<String> carNames = inputView.printInput();
		ResultView resultView = new ResultView();
		resultView.printResult(carNames, inputView.numOfTry);
		
	}

}
