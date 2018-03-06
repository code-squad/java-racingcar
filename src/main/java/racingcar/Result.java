package racingcar;

import java.util.ArrayList;

public class Result {
	static void resultView(ArrayList winners) {   // 경기의 결과를 보여주는 메서드
		for (int i = 0; i < winners.size(); i++) { 
			Car car = (Car)winners.get(i);
			System.out.print(car.getName() + ", "); // 마지막에 콤마는 없앨 수 없나?
		}
		
		System.out.println("이/가 최종우승했습니다.");
	}
}
