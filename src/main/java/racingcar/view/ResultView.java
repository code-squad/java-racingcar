package racingcar.view;

import racingcar.model.Car;
import racingcar.model.Cars;
import racingcar.model.Racing;

public class ResultView {

	private String printCarMove(Car car) {
		return repeat("-", car.getPosition());
	}

	public String repeat(String keyword, int number) {
		String resultString = "";
		for (int i = 0; i < number; i++) {
			resultString += keyword;
		}
		return resultString;
	}

	public void printOnePhase(Racing racing) {
		for (Car car : racing.getCars().getCars()) {
			System.out.print(car.getCarName() + " : ");
			System.out.println(printCarMove(car));
		}
		System.out.println();
	}

	public void printRacingRank(Racing racing) {
		Cars cars = racing.getTopRankedCarList();
		System.out.println(cars.getListString() + "이(가) 최종 우승했습니다.");
	}
}
