package calculater;

import java.util.Scanner;

public class CalculateApplication {
	public static void main(String[] args) {
		// 문자열 입력
		Scanner scanner = new Scanner(System.in);
		String fomula = scanner.nextLine();
		
		System.out.println("계산값 : " + Calculater.calculate(fomula));
	}
}
