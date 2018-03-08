package racing;

import java.util.Scanner;

public class CarName {
	public String[] setCarName(Scanner input) {
		System.out.println("경주할 자동차의 이름은 무엇 인가요? ex)pobi, riverway");
		String inputName = input.nextLine();
		String[] names = inputName.split(",");
		return names;
	}

	public int setTryNum(Scanner input) {
		System.out.println("시도할 횟수는 몇 회 인가요?");
		int num = input.nextInt();
		return num;
	}

	public Car[] makeCar(String[] names) {
		Car[] cars = new Car[names.length];
		for (int i = 0; i < names.length; i++) {
			cars[i] = new Car(names[i]);
		}
		return cars;
	}

}
