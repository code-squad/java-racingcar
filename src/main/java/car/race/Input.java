package car.race;

import java.util.Scanner;

public class Input {
	
	public static int askNumberofMoves() {
		Scanner sc = new Scanner(System.in);
		int moves = sc.nextInt();
		return moves;
	}
	
	public static String[] askNames() {

		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		String[] names = s.split(",");
		return names;
	}
}
