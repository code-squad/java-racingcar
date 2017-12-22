package racingcar;

import java.util.Scanner;
import java.util.Random;

public class RacingCar {
	
	private static void print(String sentence) {
		System.out.println(sentence);
	}
	
	private static int getInt(String sentence, Scanner sc) {
		print(sentence);
		return sc.nextInt();
	}
	
	private static void makeCar(String carDistance, int carCount, String[] car) {
		for (int i = 0; i < carCount; i++) {
			car[i] = carDistance;
			System.out.println(car[i]);
		}
	}
	
	private static int makeRandomNumber() {
		Random rd = new Random();
		return rd.nextInt(10);
	}
	
	private static String determineCondition(String[] car, String carDistance, int i) {
		int ForwardCondition = makeRandomNumber();// 4이상이면 이동
		if (ForwardCondition >= 4) {
			car[i] += carDistance;
		}
		return car[i];
	}
	
	public static void moveCar(String carDistance, int carCount, String[] car) {
		for (int i = 0; i < carCount; i++) { 
			print(determineCondition(car, carDistance, i));// 자동차
		}
	}
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int carCount = getInt("자동차 수 : ", sc);
		int moveCount = getInt("이동 회수 : ", sc);

		String[] car = new String[carCount]; // 자동차 개수만큼의 크기의 배열 생성;

		print("==== 시작 ====");
		
		String carDistance = "-";
		// 자동차 개수 생성
		makeCar(carDistance, carCount, car);
		
		print("==== 결과 ====");

		// 자동차들이 이동 횟수만큼 이동
		// 자동차 개수 만들고, 1번째자동차에 이동조건을 걸고, 맞으면 이동
		for (int i = 0; i < moveCount; i++) {
			System.out.println((i+1) + "회 움직였습니다." );
			moveCar(carDistance, carCount, car);
			System.out.println();
		}

	}
}
