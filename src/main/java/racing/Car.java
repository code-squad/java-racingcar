import java.util.Random;
import java.util.Scanner;

public class Car {
<<<<<<< HEAD

	private String name;

	private int position = 0;

	public Car(String name) {

		this.name = name;

	}

	public void oneCar(int num) {// 한 차의 주행 거리를 표현
		Random ran = new Random();
		for (int j = 0; j < num; j++) {
			rand(ran);
		}
	}

	public void rand(Random ran) {// 랜덤 숫자를 비교해 차가 얼마나 전진했는지 저장
		int r = ran.nextInt(9);

		if (r >= 4) {
			this.position++;// TODO 구현
		}
	}

	public boolean matchPosition(int max) {// 위치가 가장 큰 차인지를 비교한다.
        if(max == this.position) {
        	return true;
        }
        return false;
	}

	public int getPosition() {
		return position;
	}

	public String getName() {
		return name;
	}

=======
  
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
>>>>>>> KangGilHwan
}