package racingcar.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.*;
import static java.util.stream.Collectors.*;

import racingcar.model.Car;
import racingcar.model.Racing;

public class InputView {

	public Racing setRacing() {
		Scanner scan = new Scanner(System.in);

		System.out.println("경주할 자동차 이름을 입력하세요(이름은 쉼표(,)를 기준으로 구분).");
		List<Car> carList = parseCar(scan.nextLine());

		System.out.println("시도할 회수는 몇 회 인가요?");
		int moveCount = convertScanString(scan.nextLine());

		scan.close();
		return new Racing(carList, moveCount);
	}

	private int convertScanString(String scanString) {
		int returnValue = 0;

		try {
			returnValue = Integer.parseInt(scanString);
		} catch (Exception e) {
			System.out.println("숫자 입력이 잘못 되었습니다.");
		}
		return returnValue;
	}

	private List<Car> parseCar_original(String fullString) {
		List<String> carNames = Arrays.asList(fullString.split(","));
		List<Car> carList = new ArrayList<>();
		for (int i = 0; i < carNames.size(); i++) {
			carList.add(new Car(carNames.get(i)));
		}
		return carList;
	}
	//enhanced for 사용
	private List<Car> parseCar(String fullString) {
		List<Car> carList = new ArrayList<>();
		for(String name: Arrays.asList(fullString.split(","))) {
			carList.add(new Car(name));
		}
		return carList;
	}
	//stream과  map을  사용
	private List<Car> parseCar_map(String fullString) {
		List<String> carNames = Arrays.asList(fullString.split(","));
		List<Car> carList = carNames.stream().map(name -> new Car(name)).collect(Collectors.toList());
		return carList;
	}
}
