package car.race;

import java.util.Scanner;

public class Input {
	
	public static int takeNumberOfMoves() {
		Scanner sc = new Scanner(System.in);
		return sc.nextInt();
	}
	
	public static String takeNames() {
		Scanner sc = new Scanner(System.in);
		return sc.next();
	}
}