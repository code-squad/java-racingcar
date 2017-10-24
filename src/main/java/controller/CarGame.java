package controller;

import java.util.Scanner;

import model.Car;
import model.CarService;
import model.Cars;
import view.InputView;
import view.ResultView;

public class CarGame {
	
	public void game(String names, int turnNum) {
		ResultView rv = new ResultView();
		CarService carService = new CarService();
		Cars cars = carService.begin(names, turnNum);
		for(int i = 0; i < turnNum ; i++) {
			carService.makeOneTurn();
			//객체는 참조변수니까 위에서 만든 거 그냥 써도 되는지
			rv.printOneTurn(cars);
		}
		rv.printWinner(carService.getWinner());
	}

	public static void main(String[] args) {
		InputView iv = new InputView();
		CarService cs = new CarService();
		Scanner sc = new Scanner(System.in);
		String names = iv.getNames(sc);
		int turnNum = iv.getTurnNum(sc);
		CarGame cg = new CarGame();
		cg.game(names, turnNum);
	}
}
