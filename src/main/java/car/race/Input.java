package car.race;

import java.util.Scanner;

public class Input {
	
	public static int takeNumberofMoves() {
		Scanner sc = new Scanner(System.in);
		int moves = sc.nextInt();
		return moves;
	}
	
	public static String takeNames() {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		return s;
	}
	
	
}
