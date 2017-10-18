package car;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class CarGame {

	public List<Car> makeRandom(List<Car> carList) {
		Random rand = new Random();
		for(Car car : carList) {
			car.setRandomNumber(rand.nextInt(10));
		}
		return carList;
	}
	
	public void oneTurn(List<Car> carList, Console c) {
		for(Car car : carList) {
			c.oneCarPrint(car.getPosition(), car.getName());
		}
	}
	
	public List<Car> runMore(List<Car> carList) {
		for(Car car : carList) {
			car.plusPosition();
		}
		return carList;
	}

	public List<Car> playGame(List<Car> carList, int turnNum, Console c) {
		for(int i=0; i < turnNum; i++) {
			carList = makeRandom(carList);
			carList = runMore(carList);
			oneTurn(carList, c);
			System.out.print("\n");
		}
		return carList;
	}

	public List<Car> putNames(String[] carNamesArr, List<Car> carList) {
		Car car = null;
		String name = null;
		for(String carName : carNamesArr) {
//for문 안에서 Car car = new Car하고 매번 생성하는 것과 for문 밖에서 변수 생성하고 for문 안에서 = new Car() 하는 것이 성능이 많이 다른지?
			name = carName.trim();
			car = new Car(name);
			carList.add(car);
		}
		return carList;
	}
	
	public void begin(){
		List<Car> carList = new ArrayList<Car>();
		Scanner sc = new Scanner(System.in);
		Console c = new Console();
		String[] carNamesArr = c.getNames(sc);
		carList = putNames(carNamesArr, carList);
		int turnNum = c.getTurn(sc);
		carList = playGame(carList, turnNum, c);
		List<String> winner = getWinner(carList);
		c.printWinner(carList, winner);
	}

	
	public int getMaxPosition(List<Car> carList) {
		int maxNum = 0;
		for(Car car : carList) {
			if(maxNum < car.getPosition()) {
				maxNum = car.getPosition();
			}
		}
		return maxNum;
	}
	
	public List<String> getWinner(List<Car> carList) {
		List<String> winner = new ArrayList<String>();
		int maxNum = getMaxPosition(carList);
		for(Car car : carList) {
			if(maxNum == car.getPosition()) {
				winner.add(car.getName());
			}
		}
		return winner;
	}
	
	public static void main(String args[]) {
		CarGame car = new CarGame();
		car.begin();
	}
}
