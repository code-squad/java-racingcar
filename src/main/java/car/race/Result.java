package car.race;

public class Result {

	public static void buildResult(Car e) {
		Output.printMessage(e.getName() + ": ");
		printDash(e.getPosition());
		System.out.println("");
	}
	
	private static void printDash(int position) {
		for(int i = 0; i < position; i++) {
			System.out.print("-");
		}
	}



	public static void printWinner(String winnerNames) {
		Output.printMessage("The winner is.. " + winnerNames + "!");
	}
}
