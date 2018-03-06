import java.util.Scanner;

public class RacingPrompt {
	Scanner s = new Scanner(System.in);
	Racing r1;
	
	public void setParameter() {
		System.out.print("자동차 경주 게임 시작!");
		s.nextLine();
		System.out.print("경주할 자동차 이름을 입력하세요(이름은 쉼표(,)를 기준으로 구분)\n>>");
		String carNames = s.nextLine();
		System.out.println("시도할 횟수는 몇 회 인가요?\n>>");
		int times = s.nextInt();
		r1 = new Racing(carNames, times);
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
			setParameter();
			r1.run();
			System.out.println("우승자는 "+r1.getWinner()+"입니다.");
			isLoop = reStart();
		}
	}

	public static void main(String[] args) {
		RacingPrompt rp1 = new RacingPrompt();
		rp1.runPrompt();
	}
}