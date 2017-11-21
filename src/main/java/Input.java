import java.util.Scanner;

public class Input {
	
	public String[] getNames() {
		System.out.println("이름을 입력하세요(ex : will,pobi,honux)");
		Scanner sc = new Scanner(System.in);
		String temp = sc.nextLine();
		String[] names = temp.split(",");
		return names;
	}
	
	public int getTime() {
		System.out.println("시도할 회수는 몇 회인가요?");
		Scanner sc = new Scanner(System.in);
		int temp = sc.nextInt();
		if (!(temp > 0)) {
			System.out.println("양의 정수로 다시 입력하세요");
			return getTime();
		}
		return temp;
	}
}
