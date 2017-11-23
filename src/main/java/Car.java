import java.util.Random;

public class Car {
	private String name;

	private int position = 0;

	public Car(String name) {
		this.name = name;
	}
	//random 변수에 0~10 사이의 값을 넣어주고, 4 이상이면 1리턴(전진), 미만이면 0리턴(정지)
	public static boolean isCarMove() {
		Random randomNum = new Random();
		int isMove = randomNum.nextInt(11);
		
		return isMove > 3;
	}
	//만약 isCarMove의 값이 참이라면 position값을 1 증가.
	private int move() {
		if (isCarMove()) {
			position += 1;
			return position;
		}
		return position;
	}
	public static void printWinner(int[] status) {
		
	}
	//race를 시작하는 부분. 1 턴 동안에 car 객체들을 움직이거나 정지하게 하고, 변경된 상태를 리턴한다.
	public static int[] startRace(Car[] car, int tryNum) {
		int[] carStatus = new int[car.length];
		for (int i = 0; i < car.length; i++) {
			carStatus[i] = car[i].move();
		}
		return carStatus;
	}
}
