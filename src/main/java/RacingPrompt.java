import java.util.Scanner;

public class RacingPrompt {
	Scanner s = new Scanner(System.in);

	public void printResult(Racing r) {
		System.out.println("우승자는 " + r.winner + "입니다.");
	}

	public static void main(String[] args) {
		String[] carNames = CarInput.getNames();
		int times = CarInput.getTimes();
		Racing r1 = new Racing(carNames, times);
		r1.run();
		CarOutput.printResult(r1);
	}
}
