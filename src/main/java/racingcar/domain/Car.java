package racingcar.domain;

public class Car {
	private int tripMeter = 0;
	private String name;
	
	public Car() {}

	public Car(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
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
