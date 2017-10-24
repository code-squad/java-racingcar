import java.util.Scanner;

public class InputView {
// Accepts user input.
	String carNames;
	int numOfTry;
	
	Scanner scan = new Scanner(System.in);
	
	public String getCarNamesFromUser(){
		carNames = scan.next();
		return carNames;
	}
	public int getNumOfTry(){
		numOfTry = scan.nextInt();
		return numOfTry;
	}
}
