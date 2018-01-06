package com.mrblue.codesquad.javaracingcar;

import java.util.Scanner;
import java.util.stream.IntStream;

/**
 * Created by kineo2k on 2018. 1. 6..
 * Email : kineo2k@gmail.com
 * <p>
 * 게임을 위한 입력과 게임 루프 관리
 */
// TODO : 테스트 방법을 몰라서 Private 메소드도 전부 public으로 설정
public class RacingGame {
	private static final String MSG_NUMBER_OF_CAR  = "자동차 대수는 몇 대 인가요?";
	private static final String MSG_NUMBER_OF_MOVE = "시도할 회수는 몇 회 인가요?";

	public void gameStart() {
		final int numberOfCar  = toInt(readUserInput(MSG_NUMBER_OF_CAR));
		final int numberOfMove = toInt(readUserInput(MSG_NUMBER_OF_MOVE));

		this.gameLoop(numberOfCar, numberOfMove);
	}

	public void gameLoop(final int numberOfCar, final int numberOfMove) {
		IntStream.rangeClosed(1, numberOfCar)
				 .mapToObj(Car::newCar)
				 .forEach(car -> car.move(numberOfMove));
	}

	private String readUserInput(final String message) {
		System.out.println(message);

		final Scanner scanner = new Scanner(System.in);

		return scanner.next();
	}

	public int toInt(final String inputText) {
		if (inputText == null || inputText.isEmpty())
			throw new IllegalArgumentException();

		return Integer.parseInt(inputText);
	}

	public static void main(String[] args) {
		new RacingGame().gameStart();
	}
}
