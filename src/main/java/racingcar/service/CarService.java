package racingcar.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

import racingcar.model.Car;

public class CarService {
	public List<Car> parseCar(String fullString){
		List<String> carNames = Arrays.asList(fullString.split(","));
		List<Car> carList = new ArrayList<>();
		for(int i=0; i<carNames.size(); i++) {
			carList.add(new Car(carNames.get(i)));
		}
		return carList;
	}
	
	public void carsOnePhaseMove(List<Car> carList) {
		for(int i=0; i<carList.size(); i++) {
			randomMove(carList.get(i));
		}
	}
	
	public void randomMove(Car car) {		
		Random random = new Random();
		if(random.nextInt(10)>=4) car.addPosition();;
	}
}
