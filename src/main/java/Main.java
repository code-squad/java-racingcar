import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		Racing racing = new Racing();
		System.out.println("자동차 대수는 몇 대 인가요?");
		int numOfCar = scan.nextInt();
		System.out.println("시도할 회수는 몇 회 인가요?");
		int numOfTry = scan.nextInt();
		int[] finalLocation =  racing.returnCarPositions(numOfCar, numOfTry);
		for(int i=0; i<finalLocation.length; i++){
			System.out.print(finalLocation[i] + " ");
		}
		System.out.println("\n");
	}

}
