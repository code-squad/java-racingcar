package car.race;

public class CarRaceMain {

	public static void main(String[] args) {
		Input userInput = new Input();
		Output out = new Output();
		
		System.out.println("자동차 대수는 몇 대 인가요?");
		int numCars = userInput.askNumberofCars();
		System.out.println("시도할 횟수는 몇 인가요?");
		int numMoves = userInput.askNumberofMoves();
		
		

		for(int car = 0; car < numCars; car++) {
			System.out.println("");
			out.printResult(numMoves);
		}
	}
}
