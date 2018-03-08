package racingcar;

import java.util.Scanner;

public class CarManager {
	Scanner sc = new Scanner(System.in);

	String[] inputCar() {
		System.out.println("경주할 자동차 이름을 입력하세요(이름은 쉼표(,)를 기준으로 구분).");
		return sc.nextLine().split(",");
	}

	int inputTime() {
		System.out.println("시도할 횟수는 몇회인가요?");
		int time = sc.nextInt();
		return time;
	}

	Car[] makeCarArray(String[] names) {
		Car[] car = new Car[names.length]; // Car객체를 담을 배열생성
		for (int i = 0; i < names.length; i++) {
			car[i] = new Car(names[i]);
		}
		return car;
	}
}