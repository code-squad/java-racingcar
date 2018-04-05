package racingcar.domain;

import java.util.Random;

public class RandomRule implements Rule {
	private static final int MIN_RANDOM_VALUE = 4;
	
	public boolean isValid() {
		return getCarMoveRandomValue() >= MIN_RANDOM_VALUE;
	}
	
	public int getMoveMeterForReward() {
		return MOVE_METER_FOR_REWARD;
	}
	
	private int getCarMoveRandomValue() {
		return new Random().nextInt(10);
	}
}