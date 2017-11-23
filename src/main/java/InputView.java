import java.util.Scanner;

public class InputView {
	static String takeName() {
		Scanner scan = new Scanner(System.in);
        String inputCarName = scan.nextLine();
        //scan.close();
        
        return inputCarName;
	}
	
	static int takeNum() {
		Scanner scan = new Scanner(System.in);
        int inputTryNum = scan.nextInt();
        //scan.close();
        
        return inputTryNum;
	}
}
