package racingcar_step3;

public class ResultView {

	private static String addDistance(Car myCar) {
		String distance = "-";
		for (int i = 0; i < myCar.position; i++) {
			distance += "-";
		}
		return distance;
	}

	private static void printCarStatus(Car[] car, RacingCar rc) {
		for (int j = 0; j < car.length; j++) { // 차 순서대로 꺼내기
			Car myCar = car[j];
			int randomNumber = myCar.makeRandomNumber();
			myCar.move(randomNumber, myCar);

			String currentDistance = ResultView.addDistance(myCar);
			System.out.println(car[j].name + " : " + currentDistance);
		}
	}

	public void repeatTryNumber(int tryNumber, RacingCar rc, Car[] car) {
		for (int i = 0; i < tryNumber; i++) {
			ResultView.printCarStatus(car, rc);
			System.out.println();
		}
	}

	public int findGoldMedalScore(Car[] car) {
		int goldMedalScore = 0;
		for (int i = 0; i < car.length; i++) {
			if (car[i].position >= goldMedalScore) {
				goldMedalScore = car[i].position;
			}
		}
		return goldMedalScore;
	}

	public void printGoldMedal(int goldMedalScore, Car[] car) {
		for (int i = 0; i < car.length; i++) {
			if (goldMedalScore == car[i].position) {
				System.out.println(car[i].name + "가 최종 우승 하셨습니다.");
			}
		}
	}

}
