
import java.util.Random;
import java.util.Scanner;

public class CarRacing {
	private int time;
	private int[] carPositions = {1, 1, 1};
	
	public void run() {
		Random random = new Random();
		String[] goMark = {"", "", ""};
		for (int i = 0; i < carPositions.length; i++) {
			int randomNum = random.nextInt(10);
//			System.out.println(randomNum);
			if (randomNum >= 4) {
				carPositions[i] += 1;
			}
			for (int j = 0; j < carPositions[i]; j++) {
				goMark[i] += "-";
			}
			System.out.print(i + " : ");
			System.out.println(goMark[i]);
		}	
	}
	
	public static void main(String[] args) {
		System.out.println("자동차 대수는 몇 대 인가요?");
		Scanner scanner = new Scanner(System.in);
		int carNum = scanner.nextInt();
		System.out.println("시도할 회수는 몇 회 인가요?");
		CarRacing carRacing = new CarRacing();
		carRacing.time = scanner.nextInt();
		for (int i = 0; i < carRacing.time; i++) {
			System.out.println("try :" + (i + 1));
			carRacing.run(); 
		}
	}
}
