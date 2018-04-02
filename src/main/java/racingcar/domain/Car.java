package racingcar.domain;

public class Car {
	private int tripMeter = 0;
	
	public Car() {}
	
	public Car(int tripMeter) {
		this.tripMeter = tripMeter;
	}
	
	public int move(Rule rule) {
		if(rule.isValid()) {
			tripMeter += rule.getMoveMeterForReward();
		}
		return tripMeter;
	}
	
	public int getTripMeter() {
		return  tripMeter;
	}
}
