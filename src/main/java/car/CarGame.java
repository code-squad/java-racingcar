package car;

import java.util.List;
import java.util.Scanner;

public class CarGame {

	public void oneTurn(Cars cars, ResultView rv) {
		for(Car car : cars.getCars()) {
			rv.oneCarPrint(car.getPosition(), car.getName());
		}
	}

	public Cars runMore(Cars cars) {
		for(Car car : cars.getCars()) {
			car.move();
		}
		return cars;
	}

	public Cars playGame(Cars cars, int turnNum, ResultView rv) {
		for(int i=0; i < turnNum; i++) {
			cars = runMore(cars);
			oneTurn(cars, rv);
			System.out.print("\n");
		}
		return cars;
	}

	public Cars putNames(String[] carNamesArr) {
		Cars cars = new Cars();
		for(String carName : carNamesArr) {
			cars.addCar(new Car(carName.trim()));
		}
		return cars;
	}
	
	public void begin(){
		Scanner sc = new Scanner(System.in);
		InputView iv = new InputView();
		ResultView rv = new ResultView();
		String[] carNamesArr = iv.getNames(sc);
		Cars cars = putNames(carNamesArr);
		int turnNum = iv.getTurn(sc);
		cars = playGame(cars, turnNum, rv);
		List<String> winner = cars.getWinner();
		rv.printWinner(winner);
		sc.close();
	}

	public static void main(String args[]) {
		CarGame car = new CarGame();
		car.begin();
	}
}
