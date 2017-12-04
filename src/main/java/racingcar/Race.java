package racingcar;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Race {

	private void startGame(){
		Scanner sc = new Scanner(System.in);
		InputView iv = new InputView();
		String[] carNames = iv.InputName(sc);
		int tryTimes = iv.InputTime(sc);
		
		ArrayList<Car> carIns = new ArrayList<>();
		createCar(carIns, carNames);
		moveCar(tryTimes, carIns, carNames);
	}
	
	private void createCar(ArrayList<Car> carIns, String[] carNames){
		for (int i = 0; i < carNames.length; i++) {
			Car car = new Car(carNames[i]);
			carIns.add(i, car);
		}
	}
	
	private void moveCar(int tryTimes, ArrayList<Car> carIns, String[] carNames){
		for (int i = 0; i < tryTimes; i++) {
			injectNum(carNames, carIns);
			System.out.println();
		}
		findMaxNum(carIns);
	}
	
	private void injectNum(String[] carNames, ArrayList<Car> carIns) {
		for (int i = 0; i < carNames.length; i++) {
			int ranNum = createRanNum();
			carIns.get(i).movePosition(ranNum);
			ResultView.resultPrint(carIns.get(i));
		}
	}
	
	private int createRanNum(){
		Random random = new Random();
		return random.nextInt(10);
	}

	private void findMaxNum(ArrayList<Car> carIns) {
		int num = 0;
		for (int i = 0; i < carIns.size(); i++) {
			if(num <= carIns.get(i).position) num = carIns.get(i).position;
		}
		compareScore(num, carIns);
	}
	
	private void compareScore(int num, ArrayList<Car> carIns) {
		for (int i = 0; i < carIns.size(); i++) {
			if(num == carIns.get(i).position) {
				String winner = carIns.get(i).name;
				ResultView.printWinner(winner);
			}
		}
	}
	
	public static void main(String[] args) {
		Race race = new Race();
		race.startGame();
	}
}
