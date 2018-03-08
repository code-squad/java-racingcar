package racing;

import java.util.Random;
import java.util.Scanner;

public class Car {

	private String name;

	private int position = 0;

	public Car(String name) {

		this.name = name;

	}

	public void oneCar(int num) {// 한 차의 주행 거리를 표현
		Random ran = new Random();
		
		for (int j = 0; j < num; j++) {
			int r = ran.nextInt(9);
			move(r);
		}
	}
	
	public boolean checkTrue(int n) {// 랜덤 숫자 비교 
		if(n >= 4) {
	    	return true;
	    }
	    	return false;
	}

	public void move(int r) {// 랜덤 숫자가 4보다 크면 한칸 전진한다.
		if (checkTrue(r)) {
			this.position++;// TODO 구현
		}
	}

	public boolean matchPosition(int max) {// 위치가 가장 큰 차인지를 비교한다.
        if(max == this.position) {
        	return true;
        }
        return false;
	}

	public int getPosition() {
		return position;
	}

	public String getName() {
		return name;
	}

}