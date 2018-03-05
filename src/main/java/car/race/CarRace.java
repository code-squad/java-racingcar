package car.race;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class CarRace {
	
	public static int generateRandNum() {
		Random rand = new Random();
		int randNum = rand.nextInt();
		return randNum;
	}
	
	public static String[] askNames() {		
		Output.printMessage("경주할 자동차 이름을 입력하세요 (이름은 쉼표(,)를 기준으로 구분): ");
		String s = Input.takeNames();
		String[] names = CarRace.setNames(s);
		return names;
	}
	public static int askNumberofMoves() {
		Output.printMessage("시도할 횟수는 몇 인가요?: ");
		int moves = Input.takeNumberofMoves();
		return moves;
	}
	
	public static String[] setNames(String s) {
		String[] names = s.split(",");
		return names;
	}
	
	public static List<Car> createCarInstance(String[] names){
		List<Car> cars = new ArrayList<>();
		for(int i = 0; i < names.length; i++) {
			cars.add(new Car(names[i]));
		}
		return cars;
	}
	
	public static void incrementPosition(List<Car> cars, int moves) {
		for(Car e : cars) {
			e.position = e.countPosition(moves);
		}
	}
	
	public static void printResult(List<Car> cars) {
		for(Car e: cars) {
			Output.printMessage(e.name + ": ");
			Output.printDash(e.position);
			System.out.println("");
		}
	}

}
