public class CarOutput {

	public static void printRacing(Racing r) {
		for (Car c : r.carList) {
		System.out.printf("Car " + c.name + " >> ");
			for (int i = 0; i < c.position; i++) {
				System.out.printf("-");
			}
			System.out.println("");
		}
	}
	
	public static void printWinner(Racing r) {
		System.out.println("우승자는 "+r.winner+"입니다.");
	}
	
	public static void printResult(Racing r) {
		printRacing(r);
		printWinner(r);
	}

}
