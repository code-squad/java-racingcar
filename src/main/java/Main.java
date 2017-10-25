import java.util.*;

public class Main {
	public static void main(String[] args) {
		InputView inputView = new InputView();
		List<String> carNames = inputView.printInput();
		ResultView resultView = new ResultView();
		resultView.printResult(carNames, inputView.numOfTry);
		
	}

}
