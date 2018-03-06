package racingcar;
import java.util.*;

public class Car {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Random random = new Random();
		
		System.out.println("경주할 자동차 이름을 입력하세요. (이름은 쉼표(,)를 기준으로 구분)");

		String[] carName = carName(scanner);
		System.out.println("시도할 횟수는 몇 회 인가요?");
		int tries = tryNum(scanner);
		run(carName, tries, random);
	}
	
	static String[] carName(Scanner scanner) {   // 자동차이름 문자열 배열 메서드
		String inputName = scanner.nextLine();
		String[] name = inputName.split(",");
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
	
	static void run(String[] carName, int tries, Random random) {   // 주행메서드
		for (int i = 0; i < carName.length; i++) {
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
