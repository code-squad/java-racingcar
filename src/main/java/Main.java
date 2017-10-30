import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		InputView inputView = new InputView();
		Racing racing = new Racing(inputView.printInput());
		List<List<Car>> tryResults = new ArrayList<List<Car>>();
		ResultView resultView = new ResultView();
		for(int i=0; i < inputView.numOfTry; i++){
			// 한 시도 출력.
			tryResults.add(resultView.printOneTry(racing));
			System.out.println("\n");
		}
		List<Car> lastTryResults = tryResults.get(inputView.numOfTry-1);
		resultView.printWinners(racing, lastTryResults);
	}
}
