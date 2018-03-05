package car.race;

public class Output {
	
	public static void printMessage(String message) {
		System.out.println(message);
	}
	
	public static void printDash(int position) {
		for(int i = 0; i < position; i++) {
			System.out.print("-");
		}
	}
	

}
