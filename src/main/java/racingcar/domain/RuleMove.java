package racingcar.domain;

public class RuleMove implements Rule {
	private int moveMinValue = 4;
	private int moveMeterForReward = 1;
	
	public RuleParameter apply(RuleParameter ruleParameter) {
		if(validateMoveValue(ruleParameter.getMoveRandomValue())){
			ruleParameter.getCar().move(moveMeterForReward);
		}
		return ruleParameter;
	}
	
	private boolean validateMoveValue(int moveValue) {
		return moveValue >= moveMinValue;
	}
}