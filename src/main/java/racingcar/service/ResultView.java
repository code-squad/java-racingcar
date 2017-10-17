package racingcar.service;

import java.util.List;

import racingcar.model.Car;

public class ResultView {
	public void printOnePhase(List<Car> carList) {
		Car car = null;
		for(int i=0; i<carList.size(); i++) {
			car = carList.get(i);
			System.out.print(car.getCarName()+" : ");
			System.out.println(printCarMove(car));
		}
	}
	
	public String printCarMove(Car car) {
		String carMoveString = "";
		for(int i=0; i<car.getPosition(); i++) {
			carMoveString+="-";
		}
		return carMoveString;
	}
}
