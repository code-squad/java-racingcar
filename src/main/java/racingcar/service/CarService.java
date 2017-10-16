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
	
	public void carsMove(List<Car> carList, int moveCount) {
		for(int i=0; i<carList.size(); i++) {
			carList.get(i).setPosition(randomMove(moveCount));
		}
	}
	
	public int randomMove(int moveCount) {
		int randomMoveCount = 0;
		
		Random random = new Random();
		for(int i=0; i<moveCount; i++) {
			if(random.nextInt(10)>=4) randomMoveCount++;
		}		
		return randomMoveCount;
	}
}
