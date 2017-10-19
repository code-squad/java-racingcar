package controller;

import java.util.List;
import java.util.Scanner;

import model.Cars;
import view.InputView;
import view.ResultView;

public class CarGame {
	public void playGame(Cars cars, ResultView rv) {
		for(int i=0; i < cars.getTurnNum(); i++) {
			cars.runMore();
			rv.printOneTurn(cars);
			System.out.print("\n");
		}
	}

	public void begin(){
		Scanner sc = new Scanner(System.in);
		InputView iv = new InputView();
		ResultView rv = new ResultView();
		String[] carNamesArr = iv.getNames(sc);
		Cars cars = new Cars(carNamesArr);
		cars.setTurnNum(iv.getTurn(sc));
		playGame(cars, rv);
		List<String> winner = cars.getWinner();
		rv.printWinner(winner);
		sc.close();
	}

	public static void main(String args[]) {
		CarGame car = new CarGame();
		car.begin();
	}
}
