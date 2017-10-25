import java.util.*;
import java.util.Scanner;

public class InputView {
// Accepts user input.
	Scanner scan = new Scanner(System.in);
	int numOfTry;
	
	public String getCarNamesFromUser(){
		return scan.next();
	}
	public int getNumOfTry(){
		return scan.nextInt();
	}
	public List<String> printInput(){
		StringProcess stringProcess = new StringProcess();
		System.out.println("경주할 자동차 이름을 입력하세요(이름은 쉼표(,)를 기준으로 구분).");
		String carNamesString = getCarNamesFromUser();
		System.out.println("시도할 회수는 몇 회 인가요?");
		numOfTry = getNumOfTry();
		return stringProcess.parseInputString(carNamesString);
	}
}
