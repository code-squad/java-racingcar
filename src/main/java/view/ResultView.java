package view;

import java.util.List;

import model.Car;
import model.Cars;
import util.StringUtils;

public class ResultView {

	public void printOneCar(Car car) {
		System.out.print(car.getName() + ":");
		//메소드를 static 으로 하는 것과 객체 생성하는 차이
		StringUtils.repeat("-", car.getPosition());
		System.out.print("\n");
	}

	public void printOneTurn(Cars cars) {
		for (Car car : cars.getCars()) {
			printOneCar(car);
			System.out.println("");
		}
	}
	
	public void printWinner(List<String> winners) {
		System.out.print("우승자는 ");
		System.out.print(winners.get(0));
		if(winners.size() > 1) {
			printMoreWinners(winners);
		}
		System.out.println(" 입니다.");
	}
	
	public void printMoreWinners(List<String> winners) {
		for (int i = 1; i < winners.size(); i++) {
			System.out.print(", " + winners.get(i));
		}
	}
}
