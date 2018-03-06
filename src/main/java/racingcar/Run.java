package racingcar;

import java.util.Random;

public class Run {
	
	static void move(int tries, Random random) {   // 주행 메서드
		System.out.println("실행결과");
		for (int i = 0; i< Cars.cars.length; i++)
			moveHelp(i, tries, random);
	}

	static void moveHelp(int i, int tries, Random random) {
		System.out.print(Cars.cars[i] + " : ");
		for(int j = 0; j < tries; j++) {
			int rnd = RanNum.rndNum(random);
			if (rnd > 3) {
				System.out.print("-");
				Cars.cars[i].counterUp();
				//Cars.cars[i].setCounter(Cars.cars[i].getCounter() + 1);   // 위에 코드와 비교해보기.
			}
		}
		System.out.println();
	}
}
