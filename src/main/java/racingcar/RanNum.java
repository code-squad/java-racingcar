package racingcar;

import java.util.Random;

public class RanNum {
	static int rndNum(Random random) {   // 랜덤으로 수를 생성하는 메서드
		int rnd = random.nextInt(10);
		return rnd;
	}
}
