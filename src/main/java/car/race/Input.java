package car.race;

import java.util.Scanner;

public class Input {
	public int askNumberofCars() {
		Scanner sc = new Scanner(System.in);
		int cars = sc.nextInt();
		// sc.close();
		return cars;
	}
	
	public int askNumberofMoves() {
		Scanner sc = new Scanner(System.in);
		int moves = sc.nextInt();
		sc.close();
		return moves;
	}
}
