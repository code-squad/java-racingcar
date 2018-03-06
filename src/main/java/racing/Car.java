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
			rand(ran);
		}
	}

	public void rand(Random ran) {// 랜덤 숫자를 비교해 차가 얼마나 전진했는지 저장
		int r = ran.nextInt(9);

		if (r >= 4) {
			this.position++;// TODO 구현
		}
	}

	public boolean matchPosition(int max) {// 위치가 가장 큰 차인지를 비교다.
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