import java.util.ArrayList;

public class ResultView {
// Prints result
	public void printResult(ArrayList<String> carNames, int numOfTry){
		// car 생성 여러개 생성.
		Racing racing = new Racing();
		ArrayList<Car> cars = racing.createAllCars(carNames);
		racing.printAllTries(cars, numOfTry);
	}
}
