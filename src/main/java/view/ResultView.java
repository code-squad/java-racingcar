package view;

import java.util.List;

import model.Car;
import model.Cars;
import util.StringUtils;

public class ResultView {
	public void printOneTurn(Cars cars) {
		for(Car car : cars.getCars()) {
			StringUtils util = new StringUtils();
			System.out.print(car.getName() + ":");
			util.repeat("-", car.getPosition());
			System.out.print("\n");
		}
	}
	
	public void printWinner(List<String> winner) {
		if(winner.size() > 0) {
			System.out.print(winner.get(0));
			for(int i=1; i < winner.size(); i++) {
				System.out.print("와 ");
				System.out.print(winner.get(i));
			}
		}
		System.out.print("가 최종 우승했습니다.");
	}

}
