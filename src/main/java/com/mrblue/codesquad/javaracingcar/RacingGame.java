package com.mrblue.codesquad.javaracingcar;

import java.util.stream.IntStream;

/**
 * Created by kineo2k on 2018. 1. 6..
 * Email : kineo2k@gmail.com
 * <p>
 * 게임을 위한 입력과 게임 루프 관리
 */
// TODO: 테스트 방법을 몰라서 Private 메소드도 전부 public으로 설정
public class RacingGame {
	private static final String MSG_NUMBER_OF_CAR  = "자동차 대수는 몇 대 인가요?";
	private static final String MSG_NUMBER_OF_MOVE = "시도할 회수는 몇 회 인가요?";

	public void gameStart() {
		final int numberOfCar  = toInt(ConsoleIO.readLine(MSG_NUMBER_OF_CAR));
		final int numberOfMove = toInt(ConsoleIO.readLine(MSG_NUMBER_OF_MOVE));

		this.gameLoop(numberOfCar, numberOfMove);
	}

	private void gameLoop(final int numberOfCar, final int numberOfMove) {
		IntStream.rangeClosed(1, numberOfCar)
				 .mapToObj(Car::newCar)
				 .forEach(car -> {
				 	final int distance = car.move(numberOfMove);
				 	this.printResult(car.getCarID(), distance);
				 });
	}

	private int toInt(final String inputText) {
		if (inputText == null || inputText.isEmpty())
			throw new IllegalArgumentException();

		return Integer.parseInt(inputText);
	}

	private void printResult(final int carID, final int distance) {
		final String strCarID    = String.valueOf(carID);
		final String strDistance = String.valueOf(distance);

		ConsoleIO.println(strCarID, "번 자동차의 총 이동 거리는 ", strDistance, "입니다.");
	}

	public static void main(String[] args) {
		new RacingGame().gameStart();
	}
}
