package com.sangco.racingcar;

public class ResultView {
	private ResultView() {}
	
	public static void resultPrint(Car car){
		System.out.println(car.sb);
	}
	
	public static void printWinner(String winner) {
		System.out.println(winner + ": 가 최종 우승했습니다.");
	}
}
