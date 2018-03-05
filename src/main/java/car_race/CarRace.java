package car_race;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class CarRace {
	
	public List<Integer> generateInput() {
		List<Integer> userInput = new ArrayList<>(2);
		try(Scanner sc = new Scanner(System.in)){
			System.out.println("자동차 대수는 몇대인가요?");
			String cars = sc.next();
			int numCar = Integer.parseInt(cars);
			userInput.add(numCar);
		
			System.out.println("시도할 횟수는 몇 회 인가요?");
			String moves = sc.next();
			int numMove = Integer.parseInt(moves);
			userInput.add(numMove);
		}
		return userInput; // userInput[0] = number of cars. userInput[1] = number of moves.
	}
	
	public int generateRandNum() {
		
		Random rand = new Random();
		int randNum = rand.nextInt();

		return randNum;
	}
	
	
}
