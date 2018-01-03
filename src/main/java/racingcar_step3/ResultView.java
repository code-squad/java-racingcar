package racingcar_step3;

public class ResultView {

	public static void printGoldMedal(int goldMedalScore, Car[] car) {
		for (int i = 0; i < car.length; i++) {
			if (goldMedalScore == car[i].getPosition()) {
				System.out.println(car[i].getName() + "가 최종 우승 하셨습니다.");
			}
		}
	}

}
