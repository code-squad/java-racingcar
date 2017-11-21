import java.util.Random;
import java.util.Scanner;

public class RacingCar {
	//random 변수에 0~10 사이의 값을 넣어주고, 4 이상이면 1리턴(전진), 미만이면 0리턴(정지)
	static int isCarMove() {
		Random randomNum = new Random();
		int isMove = randomNum.nextInt(11);
		if (isMove > 3) {
			return 1;
		}
		return 0;
	}
	//자동차의 위치를 배열에 초기화해준다. 입력받은 대 수만큼 배열을 초기화 한다.
	static String[] initializeCarArray(int car) {
		String[] array = new String[car];
		
		for (int i = 0; i < car; i++) {
			array[i] = "-";
		}
		return array;
	}
	//자동차들이 움직이는지 정지했는지 매 시도 횟수마다 그려주는 메소드.
	static void drawDistance(String[] resultArray, int numToTry, int carNum) {
		for (int i = 0; i < numToTry; i++) {
			System.out.println("====================== STEP " + (i + 1) +" START ======================");
			for (int j = 0; j < carNum; j++) {
				int move = isCarMove();
				if (move == 1) {
					resultArray[j] += "-";
					System.out.println(resultArray[j] + "\n" + "CAR" + (j + 1) + " GO!");
				}else if (move == 0){
					System.out.println(resultArray[j] + "\n" + "CAR" + (j + 1) + " STOP");
				}
			}
		}
	}
	
	public static void main(String[] args) {
		System.out.println("자동차는 총 몇 대 입니까?");
		int totalCarNum = new Scanner(System.in).nextInt();
		
		System.out.println("시도할 횟수는 몇 회 입니까?");
		int tryNum = new Scanner(System.in).nextInt();
		
		String[] carArray = initializeCarArray(totalCarNum);
		
		drawDistance(carArray, tryNum, totalCarNum);
	}
}
