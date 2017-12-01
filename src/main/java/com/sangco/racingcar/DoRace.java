package com.sangco.racingcar;

import java.util.HashMap;
import java.util.Random;
import java.util.Scanner;

public class DoRace {
	public static void main(String[] args) {
		int howManyCar = 0;
		int howManyTimes = 0;
		Scanner scanCar = new Scanner(System.in);
		
		System.out.println("자동차 대수는 몇 대 인가요?");
		howManyCar = scanCar.nextInt();
		System.out.println("시도할 회수는 몇 회 인가요?");
		howManyTimes = scanCar.nextInt();
		System.out.println();
		
		Random random = new Random();
		int input = 0;
		HashMap<Integer, Object> carInstance = new HashMap<>();
		Car car;
		
		for (int i = 0; i < howManyCar; i++) {
			carInstance.put(i, new Car());
		}
		
		for (int j = 0; j < howManyTimes; j++) {
			for (int i = 0; i < howManyCar; i++) {
				input = random.nextInt(10);//+1 더하면 10 나오고 0은 안나온다 Random 클래스 다시 정리 
				car = (Car) carInstance.get(i);
				car.goOrNot(input);
			}
			System.out.println();
		}
	}
}
