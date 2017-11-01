import java.util.List;

public class Main {

	public static void main(String[] args) {
		InputView inputView = new InputView();
		// model인 Racing 에 입력데이터 전달.
		Racing racing = new Racing(inputView.printInput());
		// 시도당 처리결과를 담고있는 tryResults.
		ResultView resultView = new ResultView();
		List<Car> cars = null;
		// 기존에 만들어진 변수에 값을 재할당.
		for(int i=0; i < inputView.numOfTry; i++){
			// model에서 로직구현.
			cars = racing.doOneTry();
			// view 는 출력만을 담당.
			resultView.print(cars);
			System.out.println("\n");
		}
		// cars 에 마지막 시도의 데이터가 담김.
		resultView.printWinners(racing, cars);
	}
}
