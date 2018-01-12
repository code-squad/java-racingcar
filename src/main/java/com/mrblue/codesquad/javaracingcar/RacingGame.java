package com.mrblue.codesquad.javaracingcar;

import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * Created by kineo2k on 2018. 1. 6..
 * Email : kineo2k@gmail.com
 * <p>
 * 게임을 위한 입력과 게임 루프 관리
 */
// TODO: 테스트 방법을 몰라서 Private 메소드도 전부 public으로 설정
public class RacingGame {
	private static final String MSG_NAMES_OF_CAR   = "경주할 자동차 이름을 입력하세요(이름은 쉼표(,)를 기준으로 구분).";
	private static final String MSG_NUMBER_OF_MOVE = "시도할 회수는 몇 회 인가요?";
	private static final String INPUT_SEPARATOR    = ",";

	public void gameStart() {
		final List<String> namesOfCar   = parseNamesOfCar(ConsoleIO.readLine(MSG_NAMES_OF_CAR));
		final int          numberOfMove = toInt(ConsoleIO.readLine(MSG_NUMBER_OF_MOVE));

		this.gameLoop(namesOfCar, numberOfMove);
	}

	private void gameLoop(final List<String> namesOfCar, final int numberOfMove) {
		final List<Car> cars = this.createCars(namesOfCar);
		cars.forEach(car -> car.move(numberOfMove));

		final List<Car> bestRecordCars = this.findBestRecordCars(cars);

		this.printResult(cars, bestRecordCars);
	}

	private List<String> parseNamesOfCar(final String inputText) {
		if (inputText == null)
			throw new IllegalArgumentException();

		final String[]          names    = inputText.split(INPUT_SEPARATOR);
		final Predicate<String> notEmpty = ((Predicate<String>) String::isEmpty).negate();
		return Arrays.stream(names)
					 .map(String::trim)
					 .filter(notEmpty)
					 .collect(Collectors.toList());
	}

	private int toInt(final String inputText) {
		if (inputText == null || inputText.isEmpty())
			throw new IllegalArgumentException();

		return Integer.parseInt(inputText);
	}

	private List<Car> createCars(final List<String> namesOfCar) {
		if (namesOfCar == null || namesOfCar.isEmpty())
			return new ArrayList<>();

		return namesOfCar.stream()
						 .map(Car::newCar)
						 .collect(Collectors.toList());
	}

	private List<Car> findBestRecordCars(final List<Car> cars) {
		if (cars.isEmpty())
			return new ArrayList<>();

		final List<Car> newCars = new ArrayList<>(cars);
		newCars.sort(this.orderByDistance());
		final int bestRecord = newCars.get(0).getDistance();

		return newCars.stream()
					  .filter(car -> car.getDistance() == bestRecord)
					  .collect(Collectors.toList());
	}

	private Comparator<Car> orderByDistance() {
		return Comparator.comparingInt(Car::getDistance).reversed();
	}

	private void printResult(final List<Car> cars, final List<Car> bestRecordCars) {
		ConsoleIO.println("\n실행 결과");

		cars.forEach(this::printRecord);

		final String bestRecordCarNames =
				bestRecordCars
						.stream()
						.map(Car::getName)
						.collect(Collectors.joining(", "));

		ConsoleIO.println("\n[", bestRecordCarNames, "]가 최종 우승했습니다.");
	}

	private void printRecord(final Car car) {
		final String nameOfCar      = car.getName();
		final String movingDistance = String.valueOf(car.getDistance());

		ConsoleIO.println("  - ", nameOfCar, " : 총 이동 거리는 [", movingDistance, "]입니다.");
	}

	public static void main(String[] args) {
		new RacingGame().gameStart();
	}
}
