package racingcar.service;

import java.util.List;

import racingcar.model.Car;
import racingcar.model.Cars;

public class ResultView {
	private Cars cars = null;
	private String printCarMove(Car car) {
		return repeat("-", car.getPosition());
	}
	public String repeat(String keyword, int number) {
		String resultString = "";
		for(int i=0; i<number; i++) {
			resultString+=keyword;
		}
		return resultString;
	}
	
	private String getTopRankedCar(List<Car> carList) {
		String topCarString = "";
		cars = new Cars(carList);
		int maxPosition = getMaxPosition(carList);
		for(int i=0; i<carList.size(); i++) {
			if(cars.getPosition(i)==maxPosition) topCarString += cars.getCarName(i) + ", ";			
		}
		return topCarString.substring(0, topCarString.length()-2);
	}
	
	private int getMaxPosition(List<Car> carList) {
		int maxPosition = 0;
		cars = new Cars(carList);
		for(int i=0; i<carList.size(); i++) {
			if(maxPosition < cars.getPosition(i)) maxPosition = cars.getPosition(i);
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
