package racingcar.domain;

public class Car {
	private int tripMeter = 0;
	
	public int move(int moveMeter) {
		return tripMeter += moveMeter;
	}
	
	public int getTripMeter() {
		return  tripMeter;
	}
}
