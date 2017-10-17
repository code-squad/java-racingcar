package racingcar.service;

import java.util.List;

import racingcar.model.Car;
import racingcar.model.Racing;

public class RacingService {
	private CarService carService = new CarService();
	
	//RacingTest가 수정하지 않아도 가능하도록 수정하고 남겨둠
	public Racing setRacing() {
		InputView inputView = new InputView();
		
		return inputView.setRacing();
	}
	
	public void startRacing(Racing racing) {
		ResultView resultView = new ResultView();		
	}
}
