import java.util.Random;
import java.util.Scanner;

public class Racing {
	
	private int time;
	private int[] carPositions = {1, 1, 1};
	Random random = new Random();
	
	public void run(int car) {
		int num = random.nextInt(11);
		if(num>=4){
			carPositions[car]++;
		}
	}
	// 어떤 차를 시도할지 고르는 메소드
	public int chooseCar(int numberOfCar){
		int chosenCar = random.nextInt(2);
		return chosenCar;
	}
	// 고른 차로 시도하는 메소드
	public int[] returnCarPositions(int numberOfCar, int numOfTry){
		time = numOfTry;
		for(int i=0; i<time; i++){
			// 시도할 차를 고른다.
			int chosenCar = chooseCar(numberOfCar);
			// 고른 차를 시도한다.
			run(chosenCar);
		}
		return carPositions;
	}
}
