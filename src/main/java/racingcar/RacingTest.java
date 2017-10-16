package racingcar;

import racingcar.model.Racing;
import racingcar.service.RacingService;

public class RacingTest {
	public static void main(String[] args) {
		Racing racing = new Racing();
		RacingService racingService = new RacingService();
		
		racingService.setRacing(racing);
		racingService.startRacing(racing);
	}
}
