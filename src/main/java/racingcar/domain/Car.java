package racingcar.domain;

public class Car {
	private String name;
	private int tripMeter = 0;

	public Car(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}
	
	public int getTripMeter() {
		return tripMeter;
	}
	
	public int move(Rule rule) {
		if(rule.isValid()) {
			tripMeter += rule.getMoveMeterForReward();
		}
		return tripMeter;
	}
	
	public boolean isTripMeter(int tripMeter) {
		return  this.tripMeter == tripMeter;
	}
}
