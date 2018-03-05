import java.util.Scanner;

public class RacingPrompt {
	Scanner s = new Scanner(System.in);

	public int[] setParameter() {
		System.out.println("자동차 대수는 몇 대 인가요?\n>>");
		int numCar = s.nextInt();
		System.out.println("시도할 횟수는 몇 회 인가요?\n>>");
		int times = s.nextInt();
		int[] answer = {numCar, times};
		return answer;
	}

	public boolean reStart() {
		System.out.println("\nrestart? y/n");
		String reStart = s.next();
		switch (reStart) {
		case "y":
			return true;
		case "n":
			System.out.println("Good Bye~ Thank you.");
			return false;
		}
		return false;
	}

	public void runPrompt() {
		
		boolean isLoop = true;
		while (isLoop) {
			int[] param = setParameter();
			Racing r1 = new Racing(param[0], param[1]);
			r1.run();
			isLoop = reStart();
		}
	}

	public static void main(String[] args) {
		RacingPrompt rp1 = new RacingPrompt();
		rp1.runPrompt();
	}
}