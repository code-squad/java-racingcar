package car;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class CarGame {

	public int[] makeRandom(int carNum) {
		Random rand = new Random();
		int[] randomNum = new int[carNum];
		for(int i=0; i < carNum; i++) {
			randomNum[i] = rand.nextInt(10);
		}
		return randomNum;
	}
	
	public void race(int carNum, List<Integer> runNum) {//턴1
		for(int i=0; i < carNum; i++) {
			run(runNum.get(i));
			System.out.print("\n");
		}
	}
	
	public void run(int runNum) { //차 1대
		for(int i=0; i < runNum; i++ ) {
			System.out.print("-");
		}
	}
	
	public List<Integer> runMore(int carNum, int[]randNum, List<Integer> runNum) {
		for(int i=0; i < carNum; i++) {
			move(randNum, runNum, i);
		}
		return runNum;
	}

	private void move(int[] randNum, List<Integer> runNum, int i) {
		if(randNum[i] > 3) {
			int run = runNum.get(i) + 1;
			runNum.set(i, run);;
		}
	}
	
	public void playGame(int carNum, int turnNum, List<Integer> runNum) {
		int[] randNum = makeRandom(carNum);
		runNum = runMore(carNum, randNum, runNum);
		race(carNum, runNum);
	}
	
	public List<Integer> makeRunNumList(int carNum, List<Integer> runNum) {
		for(int i=0; i < carNum; i++) {
			runNum.add(1);
		}
		return runNum;
	}
/* 메서드 바꿀 때 이런 식으로 고치기
	public List<Integer> makeRunNumList2(int carNum, List<Integer> runNum) {
		for(int i=0; i < carNum; i++) {
			runNum.add(1);
		}
		return runNum;
	}
*/
	private List<Car> carPosition(int carNum, List<Car> carList) {
		// TODO Auto-generated method stub
		return carList;
	}	
	
	public void begin(){
		Scanner sc = new Scanner(System.in);
		List runNum = new ArrayList<Integer>();
		System.out.println("경주할 자동차 이름을 입력하세요(이름은 쉼표(,)를 기준으로 구분).");
		String  carNames = sc.next();
		System.out.println("시도할 회수는 몇 회 인가요?");
		int turnNum = sc.nextInt();
		//차 이름 배열
		String[] carNamesArr = carNames.split(",");
		int carNum = carNamesArr.length;
		List<Car> carList = new ArrayList<Car>();
		//car 객체 생성
		Car car = null;
		for(int i=0; i < carNum; i++) {
			//for문 안에서 Car car = new Car하고 매번 생성하는 것과 for문 밖에서 변수 생성하고 for문 안에서 = new Car() 하는 것이 다른가?
			car = new Car(carNamesArr[i]);
			carList.add(car);
		}
		//runNum 배열을 없애고 다 car 객체 사용으로 바꿔야 함. 
		//runNum = makeRunNumList(carNum, carList);
		runNum = carPosition(carNum, carList);
		for(int i=0; i < turnNum; i++) {
			playGame(carNum, turnNum, runNum);
			System.out.print("\n");
		}
		runNum = null;
		//리턴 값은 1개만 가능
	}
	


	public static void main(String args[]) {
		CarGame car = new CarGame();
		car.begin();
	}
}
