package car;
import java.util.Scanner;
import org.slf4j.LoggerFactory;
import org.slf4j.Logger;

public class InputView {
	private static final Logger log = LoggerFactory.getLogger(ResultView.class);

	public static void inputNameMessage() {
		log.info("경주할 자동차 이름을 입력해 주세요.(이름은 쉼표(,)를 기준으로 구분합니다.)");
	}
	public static void inputNumMessage() {
		log.info("시도할 횟수는 몇 번 인가요?");
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
