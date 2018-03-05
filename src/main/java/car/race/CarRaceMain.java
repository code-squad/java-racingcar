package car.race;

import java.util.ArrayList;
import java.util.List;

public class CarRaceMain {

	public static void main(String[] args) {
		Output.printMessage("");
		System.out.println("경주할 자동차 이름을 입력하세요 (이름은 쉼표(,)를 기준으로 구분).");
		String[] names = Input.askNames();
		System.out.println("시도할 횟수는 몇 인가요?");
		int numMoves = Input.askNumberofMoves();
		int numCars = names.length;
		
		//create instances of all the cars
		List<Car> cars = new ArrayList<>();
		for(int i = 0; i < numCars; i++) {
			cars.add(new Car(names[i]));
		}
		
		//for each car, loop: create random number and increment position
		for(Car e : cars) {
			int position = e.countPosition(numMoves);
		}
		
		// print name and position
		for(Car e : cars) {
			System.out.print(e.name + ": ");
			Output.printDash(e.position);
			System.out.println("");
		}
	}
	
	private static void getUserInput(String message) {
		Output.printMessage(message);
		
	}
}
