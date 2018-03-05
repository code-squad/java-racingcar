package racingcar;

import java.util.Random;
import java.util.Scanner;
import com.google.common.base.Strings;


public class Car {
	static private int time;
	static private int[] carPositions = {1,1,1};
	
	public static void run() {

		Scanner scanner = new Scanner(System.in);
		System.out.println("몇 번 시도하시나요?");
		time = scanner.nextInt();
		
		System.out.println("실행 결과");
		
		while(time>=0) {
			Random random = new Random();					
			time -= 1;
			System.out.println("");
			
			for(int i= 0; i<carPositions.length; i++){
				int count = random.nextInt(10);
				if(count>=4) {
					carPositions[i] += 1;	
				}
				System.out.println(Strings.repeat("-",carPositions[i]));
			}
		}
		scanner.close();
	}
	public static void main (String[] args){	
		run();
	}

}