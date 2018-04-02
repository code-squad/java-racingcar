package racingcar.domain;

public interface Rule {
	int moveMeterForReward = 1;
	
	boolean isValid();
	int getMoveMeterForReward();
}
