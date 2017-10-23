import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Racing racing = new Racing();
		System.out.println("자동차 대수는 몇 대 인가요?");
		int numOfCar = scan.nextInt();
		System.out.println("시도할 회수는 몇 회 인가요?");
		int numOfTry = scan.nextInt();
		System.out.println("\n");
		racing.printAllTries(numOfCar, numOfTry);
		
	}

}
