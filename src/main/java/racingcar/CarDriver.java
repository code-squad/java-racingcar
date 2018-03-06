package racingcar;

import java.util.*;

public class CarDriver {  // 실행메서드
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
	
		System.out.println("경주할 자동차 이름을 입력하세요. (이름은 쉼표(,)를 기준으로 구분)");
		String[] nameArr = Input.carName(scanner);   // 자동차들의 이름을 입력한다.
		CarArray carArr = new CarArray(nameArr);
		
		System.out.println("시도할 회수는 몇회인가요?");
		int tries = Input.tryNum(scanner);   // 시도할 횟수를 입력한다.
		Run.move(tries, carArr);   // 경기를 시작한다.
	
		ArrayList winners = Winners.winners(carArr);   // 우승자를 가린다.
		Result.resultView(winners);   // 경기결과를 출력한다.
	}
}
