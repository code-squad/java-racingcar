package racingcar;

import java.util.Random;

public class Run {
	
	static void move(int tries, CarArray carArr ) {   // 주행 메서드
		System.out.println("실행결과");
		for (int i = 0; i< carArr.getCarArr().length; i++)
			moveHelp(i, tries, carArr);
	}

	static void moveHelp(int i, int tries, CarArray carArr) {
		Random random = new Random();
		System.out.print(carArr.getCarArr()[i] + " : ");
		for(int j = 0; j < tries; j++) {
			int rnd = RanNum.rndNum(random);
			if (rnd > 3) {
				System.out.print("-");
				carArr.getCarArr()[i].counterUp();
				
			}
		}
		System.out.println();
	}
}
