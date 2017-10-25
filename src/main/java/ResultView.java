import java.util.ArrayList;

public class ResultView {
// Prints result
	Racing racing = new Racing();
	
	public void printTry(ArrayList<Car> cars) {
		// 시도 한번 수행시 print 하는 메소드.
		for (Car car : cars) {
			System.out.println(racing.returnCurrCarPosition(car));
		}
	}
	public void printAllTries(ArrayList<Car> cars, int numberOfTry) {
		// 전체 시도 모두 print 하는 메소드.
		racing.setTime(numberOfTry);
		int numOfTry = racing.getTime();
		for (int i = 0; i < numOfTry; i++) {
			printTry(cars);
			System.out.println("\n");
		}
	}
	public void printResult(ArrayList<String> carNames, int numOfTry){
		// car 생성 여러개 생성.
		Racing racing = new Racing();
		ArrayList<Car> cars = racing.createAllCars(carNames);
		printAllTries(cars, numOfTry);
	}
}
