package car;
import java.util.Scanner;

public class InputView {
	//경주 할 자동차의 이름을 입력하라는 메세지 출력.
	public static void inputNameMessage() {
		System.out.println("경주할 자동차 이름을 입력해 주세요.(이름은 쉼표(,)를 기준으로 구분합니다.)");
	}
	//시도 할 횟수를 입력하라는 메세지 출력.
	public static void inputNumMessage() {
		System.out.println("시도할 횟수는 몇 번 인가요?");
	}
	
	public static String takeName() {
		Scanner scan = new Scanner(System.in);
		String inputCarName = scan.nextLine();
		//scan.close();
        
		return inputCarName;
	}
	
	public static int takeNum() {
		Scanner scan = new Scanner(System.in);
		int inputTryNum = scan.nextInt();
		//scan.close();
        
		return inputTryNum;
	}
}
