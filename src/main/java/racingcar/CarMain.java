package racingcar;

import java.util.ArrayList;
import java.util.Scanner;

public class CarMain {
	
	public void race() {
		Scanner scan = new Scanner(System.in);
		
		String Inputname = InputView.inputName(scan);
		String[] name = InputView.nameSplit(Inputname);
		
		CarRaceUtill carUtill = new CarRaceUtill();
		carUtill.addCarNames(name);

		int tryNum = InputView.tryingNumber(scan);
		carUtill.moveCars(tryNum);
		
		ArrayList<Car> winner = carUtill.winner(carUtill.topPosition());
		ResultView.printWinner(winner);
	}

	
	public static void main(String[] args) {
		CarMain carRace = new CarMain();
		carRace.race();
	}
}
