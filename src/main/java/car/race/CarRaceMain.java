package car.race;

import java.util.List;

public class CarRaceMain {

	public static void main(String[] args) {
		
		String playerNames = getPlayerNames();
		int numberofMoves = getNumberofMoves();
		CarRace race = new CarRace(playerNames, numberofMoves);
		
		List<Car> cars = race.createCarInstances();
		race.startRace(cars);
		
		Result result = new Result();
		result.showResult(cars);
		result.findWinner(cars);
		result.printWinner();
	}	
	
	private static String getPlayerNames() {
		Output.printMessage("경주할 자동차 이름을 입력하세요 (이름은 쉼표(,)를 기준으로 구분): ");
		String playerNames = Input.takeNames();
		return playerNames;
	}
	
	private static int getNumberofMoves() {
		Output.printMessage("시도할 횟수는 몇 인가요?: ");
		int numMoves = Input.takeNumberofMoves();
		return numMoves;
	}
}
