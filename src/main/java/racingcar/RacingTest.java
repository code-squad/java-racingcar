package racingcar;

import racingcar.model.Racing;
import racingcar.service.RacingService;

public class RacingTest {
	public static void main(String[] args) {
		RacingService racingService = new RacingService();
		
		Racing racing = racingService.setRacing();
		racingService.startRacing(racing);
	}
}
