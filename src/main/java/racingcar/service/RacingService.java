package racingcar.service;

import java.util.List;
import java.util.Random;

import racingcar.model.Car;
import racingcar.model.Racing;

public class RacingService {
	
	//RacingTest가 수정하지 않아도 가능하도록 수정하고 남겨둠
	public Racing setRacing() {
		InputView inputView = new InputView();
		
		return inputView.setRacing();
	}
	

	public void startRacing(Racing racing) {
		ResultView resultView = new ResultView();
		List<Car> carList = racing.getCars();
		for(int i=0; i<racing.getMoveCount(); i++) {
			carsOnePhaseMove(carList);
			resultView.printOnePhase(carList);			
		}
		resultView.printRacingRank(carList);
	}
	
	public void carsOnePhaseMove(List<Car> carList) {
		for(int i=0; i<carList.size(); i++) {
			randomMove(carList.get(i));
		}
	}
	
	private void randomMove(Car car) {		
		Random random = new Random();
		if(random.nextInt(10)>=4) car.addPosition();
	}
}
