package car;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class CarGame {

	public List<Car> makeRandom2(List<Car> carList) {
		Random rand = new Random();
		for(Car car : carList) {
			car.setRandomNumber(rand.nextInt(10));
		}
		return carList;
	}
	
	public void race2(List<Car> carList) {//턴1
		for(Car car : carList) {
			run2(car.getPosition(), car.getName());
			System.out.print("\n");
		}
	}
	
	public void run2(int runNum, String carName) { //차 1대
		System.out.print(carName + ":");
		for(int i=0; i < runNum; i++ ) {						
			System.out.print("-");
		}
		//마지막에 결과값 필요
	}

	public List<Car> runMore2(List<Car> carList) {
		for(Car car : carList) {
			move2(car);
		}
		return carList;
	}

	public void move2(Car car) {
		if(car.getRandomNumber() > 3) {
			car.plusPosition();
		}	}

	public void playGame2(int carNum, int turnNum, List<Car> carList) {
		carList = makeRandom2(carList);
		carList = runMore2(carList);
		race2(carList);
	}
	
	public List<Integer> makeRunNumList(int carNum, List<Integer> runNum) {
		for(int i=0; i < carNum; i++) {
			runNum.add(1);
		}
		return runNum;
	}
	
	public void begin(){
		Scanner sc = new Scanner(System.in);
		List runNum = new ArrayList<Integer>();
		System.out.println("경주할 자동차 이름을 입력하세요(이름은 쉼표(,)를 기준으로 구분).");
		String  carNames = sc.nextLine();
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
		//makeRunNumList 는 처음에 1값을 주는 초기화 작업인데 car 객체를 쓰면 필요없음. 
		//runNum = makeRunNumList(carNum, carList);
		for(int i=0; i < turnNum; i++) {
			//runNum 배열을 없애고 다 car 객체 사용으로 바꿔야 함. 
			//playGame(carNum, turnNum, runNum);
			playGame2(carNum, turnNum, carList);
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
