package racingcar.domain;

import java.util.Random;

public class RandomRule implements Rule {
	private int minRandmonValue = 4;
	
	public boolean isValid() {
		return minRandmonValue <= getCarMoveRandomValue();
	}
	
	public int getMoveMeterForReward() {
		return moveMeterForReward;
	}
	
	private int getCarMoveRandomValue() {
		return new Random().nextInt(10);
	}
}