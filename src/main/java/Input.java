import java.util.Scanner;

public class Input {
	
	static Scanner sc = new Scanner(System.in);
	
	static String[] getNames() {
		System.out.println("이름을 입력하세요(ex : will,pobi,honux)");
		String temp = sc.nextLine();
		return temp.split(",");
	}
	
	static int getTime() {
		System.out.println("시도할 회수는 몇 회인가요?");
		int temp = sc.nextInt();
		if (!(temp > 0)) {
			System.out.println("양의 정수로 다시 입력하세요");
			sc.close();
			return getTime();
		}
		sc.close();
		return temp;
	}
}
