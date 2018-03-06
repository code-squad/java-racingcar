package racingcar;
import java.util.Random;

public class MainCar {
	
	private Car[] car;

	public MainCar(Car[] car) {
		this.car =  car;
	}
	
	void inputTime(int carNum, int time) {
		for (int k = 0; k < carNum; k++) {
			randFor(k, time);
		}
	}

	void randFor(int k, int time) {
		for (int i = 0; i < time; i++) {
			rand(k);
		}
	}

	void rand(int k) {
		Random rand = new Random();
		int rNum = rand.nextInt(10);
		if (rNum >= 4) {
			car[k].updatePosition();
		}
	}

	public static void main(String[] args) {

		CarManager carManager = new CarManager();
		Car[] car = carManager.inputCar();
		int time = carManager.inputTime();

		MainCar mainCar = new MainCar(car);
		mainCar.inputTime(car.length, time);

		CarResult carResult = new CarResult(car);
		carResult.resultView(car.length);
		carResult.winnerView(car.length);
	}
}
