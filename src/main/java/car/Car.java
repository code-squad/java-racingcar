package car;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Car {

	private List<Integer> runNum = null;
	
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
	
	public boolean canGo(int randomNum) {
		boolean go = false;
		if(randomNum > 3) {
			go = true;
		}
		return go;
	}
	
	public List<Integer> runMore(int carNum, int[]randNum, List<Integer> runNum) {
		for(int i=0; i < carNum; i++) {
			if(canGo(randNum[i])) {
				int run = runNum.get(i) + 1;
				runNum.set(i, run);;
			}
		}
		return runNum;
	}
	
	public void playGame(int carNum, int turnNum) {
		int[] randNum = makeRandom(carNum);
		runNum = runMore(carNum, randNum, runNum);
		race(carNum, runNum);
	}
	
	public void makeRunNumList(int carNum) {
		for(int i=0; i < carNum; i++) {
			runNum.add(1);
		}
	}
	
	public void begin(){
		Scanner sc = new Scanner(System.in);
		runNum = new ArrayList<Integer>();
		System.out.println("자동차 대수는 몇 대 인가요?");
		int carNum = sc.nextInt();
		System.out.println("시도할 회수는 몇 회 인가요?");
		int turnNum = sc.nextInt();
		makeRunNumList(carNum);
		for(int i=0; i < turnNum; i++) {
			playGame(carNum, turnNum);
			System.out.print("\n");
		}
		runNum = null;
	}
	
	public static void main(String args[]) {
		Car car = new Car();
		car.begin();
	}
}
