package calculater;

import calculater.domain.Calculater;

import java.util.Scanner;

public class CalculateApplication {
	public static void main(String[] args) {
		System.out.print("계산식을 입력해주세요 : ");
		// 문자열 입력
		Scanner scanner = new Scanner(System.in);
		String fomula = scanner.nextLine();
		
		System.out.println("계산값 : " + Calculater.calculate(fomula));
	}
}
