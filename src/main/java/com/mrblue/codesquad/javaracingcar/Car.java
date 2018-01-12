package com.mrblue.codesquad.javaracingcar;

import com.mrblue.codesquad.helpers.StringHelper;

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
	private String nameOfCar;
	private int    distance;

	private Car(final String nameOfCar) {
		this.nameOfCar = nameOfCar;
	}

	public void move(final int numberOfMove) {
		IntStream.rangeClosed(1, numberOfMove)
				 .mapToObj(idx -> this.randomNumber())
				 .filter(this::isAllowRange)
				 .reduce((first, second) -> first + second)
				 .ifPresent(distance -> this.distance = distance);
	}

	private int randomNumber() {
		return new Random().nextInt(10);
	}

	private boolean isAllowRange(final int randomNumber) {
		return randomNumber >= 4 && randomNumber < 10;
	}

	public String getName() {
		return nameOfCar;
	}

	public int getDistance() {
		return distance;
	}

	public static Car newCar(final String nameOfCar) {
		if (StringHelper.isNullOrEmpty(nameOfCar))
			throw new IllegalArgumentException();

		return new Car(nameOfCar);
	}
}