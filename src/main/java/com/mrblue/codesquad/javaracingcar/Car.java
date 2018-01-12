package com.mrblue.codesquad.javaracingcar;

import java.util.Optional;
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

	private Car(final int carID) {
		this.carID = carID;
	}

	public int move(final int numberOfMove) {
		final Optional<Integer> optionalDistance =
				IntStream.rangeClosed(1, numberOfMove)
						 .mapToObj(idx -> this.randomNumber())
						 .filter(this::isAllowRange)
						 .reduce((first, second) -> first + second);

		if (optionalDistance.isPresent())
			return optionalDistance.get();

		return 0;
	}

	private int randomNumber() {
		return new Random().nextInt(10);
	}

	private boolean isAllowRange(final int randomNumber) {
		return randomNumber >= 4 && randomNumber < 10;
	}

	public int getCarID() {
		return carID;
	}

	public static Car newCar(final int carID) {
		if (carID < 0)
			throw new IllegalArgumentException();

		return new Car(carID);
	}
}