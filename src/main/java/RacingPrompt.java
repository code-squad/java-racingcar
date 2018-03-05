import java.util.Scanner;

public class RacingPrompt {
	Scanner s = new Scanner(System.in);

	public void runPrompt() {
		boolean isLoop = true;
		while (isLoop) {
			System.out.println("자동차 대수는 몇 대 인가요?\n>>");
			int numCar = s.nextInt();

			System.out.println("시도할 횟수는 몇 회 인가요?\n>>");
			int times = s.nextInt();
			
			System.out.println("numCar is : " + numCar);
			System.out.println("times is : " + times);

			Racing r1 = new Racing(numCar, times);
			r1.run();
			
			System.out.println("\nrestart? y/n");
			String reStart = s.next();
			switch (reStart) {
			case "y":
				continue;
			case "n":
				System.out.println("Good Bye~");
				isLoop = false;
				break;
			}
		}
	}

	public static void main(String[] args) {
		RacingPrompt rp1 = new RacingPrompt();
		rp1.runPrompt();
	}
}
