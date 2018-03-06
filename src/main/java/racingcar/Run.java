package racingcar;

import java.util.Random;

public class Run {
	static void move(Car[] cars, int tries, Random random) {   // 주행 메서드
		System.out.println("실행결과");
		for (int i = 0; i< cars.length; i++)
			moveHelp(i, cars, tries, random);
	}

	static void moveHelp(int i, Car[] cars, int tries, Random random) {
		System.out.print(cars[i] + " : ");
		for(int j = 0; j < tries; j++) {
			int rnd = RanNum.rndNum(random);
			if (rnd > 3) {
				System.out.print("-");
				cars[i].setCounter(cars[i].getCounter() + 1);
			}
		}
		System.out.println();
	}
}
