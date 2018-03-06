package racingcar;

import java.util.Scanner;

public class carMain {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Car racing = new Car();
		System.out.println("몇 대 있나요?");
		int carNum = scan.nextInt();
		
		System.out.println("몇 번 하실 건가요?");
		int tryNum = scan.nextInt();
		
		racing.race(carNum, tryNum);
	}

}
