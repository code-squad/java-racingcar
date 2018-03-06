package racingcar;
import java.util.*;


public class Car {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Random random = new Random();
		

		System.out.println("자동차 대수는 몇대인가요?");
		String[] carName = carArr(scanner);
		System.out.println("시도할 횟수는 몇 회 인가요?");
		int tries = tryNum(scanner);
		run(carName, tries, random);
	}
	
	static String[] carArr(Scanner scanner) {   // 자동차이름 문자열 배열 메서드
		int cars = scanner.nextInt();
		String[] name = new String[cars];
		return name;
	}
	
	static int tryNum(Scanner scanner) {   // 시도할 횟수 입력메서드
		int tries = scanner.nextInt();
		return tries;
	}
	
	static int rndNum(Random random) {   // 랜덤번호 메서드
		int rnd = random.nextInt(10);
		return rnd;
	}
	

	static void run(String[] carArr, int tries, Random random) {   // 주행메서드
		for (int i = 0; i < carArr.length; i++) {
			run2(tries, random);
		}
			
	}
	
	static void run2(int tries, Random random) {  // 주행메서드 2
		for (int j = 0; j < tries; j++) {
			int rnd = rndNum(random);
			if (rnd > 3) {
				System.out.print("-");
			}
		}
		System.out.println();
	}
}
