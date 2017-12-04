package com.sangco.racingcar;

import java.util.Scanner;

public class InputView {
	private static InputView inputView;
	private InputView() {}
	
	public static InputView getInstance() {
		if(inputView == null) {
			inputView = new InputView();
		}
		return inputView;
	}
	
	public String[] InputName(Scanner sc){
		System.out.println("자동차 이름을 입력해주세요.(쉼표로 구분)");
		String carName = sc.nextLine();
		String[] carNames = carName.split(",");
		return carNames;
	}
	
	public int InputTime(Scanner sc){
		System.out.println("시도할 횟수는 몇회입니까?");
		int tryTimes = sc.nextInt();
		return tryTimes;
	}
}
