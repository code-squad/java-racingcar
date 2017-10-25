import java.util.Scanner;

public class InputView {
// Accepts user input.
	Scanner scan = new Scanner(System.in);
	
	public String getCarNamesFromUser(){
		return scan.next();
	}
	public int getNumOfTry(){
		return scan.nextInt();
	}
}
