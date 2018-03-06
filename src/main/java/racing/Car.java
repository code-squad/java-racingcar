import java.util.Random;
import java.util.Scanner;

public class Car {
  
  public void run(int car, int num) {//모든 차의 주행 거리를 표현
	  Random ran = new Random();
	  
    for(int i = 0; i < car; i++) {
    	onecar(ran, num);
  }
 }
  
  public void onecar(Random ran, int num) {//한 차의 주행 거리를 표현
    for(int j = 0; j < num; j++) {
		rand(ran);
	}
	System.out.println("");
  }
    
  public void rand(Random ran) {//랜덤 숫자를 비교해 전진, 정지를 표현
	  int r = ran.nextInt(9);
		
		if(r >= 4) {
			System.out.print("-");// TODO 구현
		}
  }
  
  public static void main(String args[]) {
	  Scanner nn = new Scanner(System.in);
	  Car race = new Car();
	  
	  System.out.println("자동차 대수는 몇 대 인가요?");
	  int num = nn.nextInt();
	  
	  System.out.println("시도할 횟수는 몇 회 인가요?");
	  int car = nn.nextInt();
	  
	 race.run(num, car);
	  
  }
}