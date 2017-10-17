package racingcar.service;

import java.util.List;

import racingcar.model.Car;

public class ResultView {
	private String printCarMove(Car car) {
		String carMoveString = "";
		for(int i=0; i<car.getPosition(); i++) {
			carMoveString+="-";
		}
		return carMoveString;
	}
	
	private String getTopRankedCar(List<Car> carList) {
		String topCarString = "";
		int maxPosition = getMaxPosition(carList);
		for(int i=0; i<carList.size(); i++) {
			if(carList.get(i).getPosition()==maxPosition) topCarString += carList.get(i).getCarName() + ", ";			
		}
		return topCarString.substring(0, topCarString.length()-2);
	}
	
	private int getMaxPosition(List<Car> carList) {
		int maxPosition = 0;
		for(int i=0; i<carList.size(); i++) {
			if(maxPosition < carList.get(i).getPosition()) maxPosition = carList.get(i).getPosition();
		}
		return maxPosition;
	}
	
	public void printOnePhase(List<Car> carList) {
		Car car = null;
		for(int i=0; i<carList.size(); i++) {
			car = carList.get(i);
			System.out.print(car.getCarName()+" : ");
			System.out.println(printCarMove(car));
		}
		System.out.println();
	}
	
	public void printRacingRank(List<Car> carList) {
		String topCarsString = getTopRankedCar(carList);
		System.out.println(topCarsString+"이(가) 최종 우승했습니다.");
	}
}
