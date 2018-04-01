package racingcar.domain;

public class RuleParameter {
	private Car car;
	private int moveRandomValue;
	
	public RuleParameter(Car car, int moveRandomValue) {
		this.car = car;
		this.moveRandomValue = moveRandomValue;
	}
	
	public void setCar(Car car) {
		this.car = car;
	}
	
	public Car getCar() {
		return car;
	}
	
	public void setMoveRandomValue(int racingMoveValue) {
		this.moveRandomValue = racingMoveValue;
	}
	
	public int getMoveRandomValue() {
		return moveRandomValue;
	}
}
