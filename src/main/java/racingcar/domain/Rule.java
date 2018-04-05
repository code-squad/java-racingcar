package racingcar.domain;

public interface Rule {
	int MOVE_METER_FOR_REWARD = 1;
	
	boolean isValid();
	int getMoveMeterForReward();
}
