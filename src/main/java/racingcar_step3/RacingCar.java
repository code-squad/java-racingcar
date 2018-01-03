package racingcar_step3;

import java.util.Scanner;

public class RacingCar {
	
	private Car[] makeCar(String[] names) {
		Car car[] = new Car[names.length];//자동차 개수 만큼 배열 생성
		for (int i = 0; i < names.length; i++) {
			car[i] = new Car(names[i]);//자동차 생성해서, 배열에 넣기
		}
		return car;
	}
	
	private static String addDistance(Car myCar) {
		String distance = "-";
		for (int i = 0; i < myCar.getPosition(); i++) {
			distance += "-";
		}
		return distance;
	}

	private static void printCarStatus(Car[] car) {
		for (int j = 0; j < car.length; j++) { // 차 순서대로 꺼내기
			Car myCar = car[j];
			int randomNumber = myCar.makeRandomNumber();
			myCar.move(randomNumber);

			String currentDistance = addDistance(myCar);
			System.out.println(car[j].getName() + " : " + currentDistance);
		}
	}

	public static void repeatTryNumber(int tryNumber, Car[] car) {
		for (int i = 0; i < tryNumber; i++) {
			printCarStatus(car);
			System.out.println();
		}
	}

	public static int findGoldMedalScore(Car[] car) {
		int goldMedalScore = 0;
		for (int i = 0; i < car.length; i++) {
			if (car[i].getPosition() >= goldMedalScore) {
				goldMedalScore = car[i].getPosition();
			}
		}
		return goldMedalScore;
	}

	
	public static void main(String[] args) {
		
		System.out.println("경주할 자동차 이름을 입력하세요(이름은 쉼표(,)를 기준으로 구분.)");
		Scanner scanner = new Scanner(System.in);
		String inputNames = InputView.input(scanner);
		String[] names = InputView.splitNames(inputNames);

		RacingCar racingCar = new RacingCar();
		Car[] car = racingCar.makeCar(names);
		
		System.out.println("시도할 회수는 몇회 인가요? : ");
		int tryNumber = scanner.nextInt();
		
		repeatTryNumber(tryNumber, car);
		
		int goldMedalScore = findGoldMedalScore(car);
		ResultView.printGoldMedal(goldMedalScore, car);
		
	}//main
}
