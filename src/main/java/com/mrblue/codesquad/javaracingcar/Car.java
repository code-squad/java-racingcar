package com.mrblue.codesquad.javaracingcar;

import java.util.Random;
import java.util.stream.IntStream;

/**
 * Created by kineo2k on 2018. 1. 6..
 * Email : kineo2k@gmail.com
 * <p>
 * 자동차 이동 알고리즘 관리
 */
// TODO : 테스트 방법을 몰라서 Private 메소드도 전부 public으로 설정
public class Car {
	private int carID;

	public Car(final int carID) {
		this.carID = carID;
	}

	public void move(final int numberOfMove) {
		IntStream.rangeClosed(1, numberOfMove)
				 .mapToObj(idx -> this.randomNumber())
				 .filter(this::isAllowRange)
				 .reduce((first, second) -> first + second)
				 .ifPresent(this::printResult);
	}

	public int randomNumber() {
		return new Random().nextInt(10);
	}

	public boolean isAllowRange(final int randomNumber) {
		return randomNumber >= 4 && randomNumber < 10;
	}

	public void printResult(final int distance) {
		final String resultMessage = new StringBuilder()
				.append(this.carID)
				.append("번 자동차의 총 이동 거리는 ")
				.append(distance)
				.append("입니다.")
				.toString();

		System.out.println(resultMessage);
	}

	public static Car newCar(final int carID) {
		if (carID < 0)
			throw new IllegalArgumentException();

		return new Car(carID);
	}
}