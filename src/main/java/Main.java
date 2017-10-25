import java.util.ArrayList;

public class Main {
	public static void main(String[] args) {
		StringProcess stringProcess = new StringProcess();
		System.out.println("경주할 자동차 이름을 입력하세요(이름은 쉼표(,)를 기준으로 구분).");
		InputView inputView = new InputView();
		String carNamesString = inputView.getCarNamesFromUser();
		ArrayList<String> carNames = stringProcess.parseInputString(carNamesString);
		System.out.println("시도할 회수는 몇 회 인가요?");
		int numOfTry = inputView.getNumOfTry();
		ResultView resultView = new ResultView();
		resultView.printResult(carNames, numOfTry);
		
	}

}
