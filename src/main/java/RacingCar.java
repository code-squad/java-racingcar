import java.util.Random;
import java.util.Scanner;

public class RacingCar {
	//random 변수에 0~10 사이의 값을 넣어주고, 4 이상이면 1리턴(전진), 미만이면 0리턴(정지)
	static boolean isCarMove() {
		Random randomNum = new Random();
		int isMove = randomNum.nextInt(11);
		
		return isMove > 3;
	}
	//자동차의 위치를 배열에 초기화해준다. 입력받은 대 수만큼 배열을 초기화 한다.
	static String[] initializeCarList(int car) {
		String[] totalCar = new String[car];
		
		for (int i = 0; i < car; i++) {
			totalCar[i] = "-";
		}
		return totalCar;
	}
	//입력받은 자동차가 움직이면 "-"를 하나 추가한 뒤, return. 아닐 시에는 그냥 return.
	public static String move(String[] result, int carNum) {
		if (isCarMove()) {
			result[carNum] += "-";
			return result[carNum];
		}
		return result[carNum];
	}
	//모든 자동차들이 움직이는지 정지했는지 check 후, 매 시도 횟수마다 그려주는 메소드.
	private static void drawAllCar(String[] totalCar) {
		for (int j = 0; j < totalCar.length; j++) {
			boolean isMove = totalCar[j].equals(move(totalCar,j));		//move 메소드에서 상태를 최신화 시켜주고, 움직였는지 아닌지를 isMove에 저장.
			draw(totalCar, j, isMove);
		}
	}
	//실제로 출력값을 그려주는 메소드. (GO/STOP message 함께 출력)
	private static void draw(String[] drawList, int drawNum, boolean message) {
		if (message) {
			System.out.println(drawList[drawNum] + "\n" + "CAR" + (drawNum + 1) + " STOP");
			return;
		}
		System.out.println(drawList[drawNum] + "\n" + "CAR" + (drawNum + 1) + " GO!");
	}
	
	public static void main(String[] args) {
		System.out.println("자동차는 총 몇 대 입니까?");
		int totalCarNum = new Scanner(System.in).nextInt();
		
		System.out.println("시도할 횟수는 몇 회 입니까?");
		int tryNum = new Scanner(System.in).nextInt();
		
		String[] totalCarPos = initializeCarList(totalCarNum);
		
		for (int i = 0; i < tryNum; i++) {
			System.out.println("====================== STEP " + (i + 1) + " START ======================");
			drawAllCar(totalCarPos);
		}
	}
}
