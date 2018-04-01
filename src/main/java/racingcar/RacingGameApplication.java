package racingcar;

import racingcar.domain.Car;
import racingcar.domain.Rule;
import racingcar.domain.RuleMove;
import racingcar.domain.RuleParameter;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.stream.IntStream;

public class RacingGameApplication {
	private static List<Rule> ruleList = new ArrayList<>();
	
	static {
		initRuleList();
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		List<Car> carList = new ArrayList<>();
		
		System.out.print("자동차 대수는 몇 대 인가요? ");
		int carNum = scanner.nextInt();
		IntStream.range(0, carNum)
				.forEach(n -> carList.add(new Car()));
		
		System.out.print("시도할 회수는 몇 회 인가요? ");
		int roundNum = scanner.nextInt();
		
		System.out.println("\n실행결과");
		race(carList, roundNum);
	}
	
	private static boolean initRuleList() {
		return ruleList.add(new RuleMove());
	}
	
	private static int getCarMoveRandomValue() {
		return new Random().nextInt(10);
	}
	
	private static void race(List<Car> carList, int roundNum) {
		for(int round = 1; round <= roundNum; round++) {
			System.out.println("Round " + round);
			playRound(carList);
			System.out.println();
		}
	}
	
	private static void playRound(List<Car> carList) {
		for(Car car : carList) {
			RuleParameter ruleParameter= new RuleParameter(car, getCarMoveRandomValue());
			playByRuleList(ruleParameter);
			
			IntStream.range(0, car.getTripMeter())
					.forEach(t -> System.out.print("-"));
			
			System.out.println();
		}
	}
	
	private static void playByRuleList(RuleParameter ruleParameter) {
		for(Rule rule : ruleList) {
			rule.apply(ruleParameter);
		}
	}
}
