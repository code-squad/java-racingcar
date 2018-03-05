package racingcar;

import java.util.Scanner;

public class CarManager {
	Scanner sc = new Scanner(System.in);

	Car[] inputCar() {
		System.out.println("경주할 자동차 이름을 입력하세요(이름은 쉼표(,)를 기준으로 구분).");
		String input = sc.nextLine();
		String[] names = input.split(",");
		int carNum = names.length;

		Car[] car = new Car[carNum]; // Car객체를 담을 배열생성
		for (int i = 0; i < carNum; i++) {
			car[i] = new Car(names[i]);
		}

		return car;
	}

	int inputTime() {
		System.out.println("시도할 횟수는 몇회인가요?");
		int time = sc.nextInt();
		return time;
	}

}
