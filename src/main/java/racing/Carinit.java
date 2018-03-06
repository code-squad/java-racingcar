package racing;

import java.util.Random;
import java.util.Scanner;
import java.util.Arrays;

public class Carinit {

	public Car[] CarName(String[] names) {// 생성자를 사용하는 메소드
		Car[] tt = new Car[names.length];
		for (int i = 0; i < names.length; i++) {
			tt[i] = new Car(names[i]);
		}
		return tt;
	}

	public void run(int car, int num, Car[] win) {// 모든 차의 주행 거리를 표현
		Random ran = new Random();
		for (int i = 0; i < car; i++) {
			win[i].oneCar(ran, num, win);
		}
	}
	
	public int maxCar(Car[] win) {
		int max;
		int[] carn = new int[win.length];

		for(int i = 0; i < win.length; i++) {
			carn[i] = win[i].getPosition();
		}
		Arrays.sort(carn);
		max = carn[carn.length-1];     //정렬을 이용하여 큰 수를 max에 넣는다.
	
		return max;
	}
	
	public void winCar(int max, Car[] win) {
		for(int i = 0; i < win.length; i++) {
			if(max == win[i].getPosition()){
				System.out.print(win[i].getName() + " ");
			}
		}
		System.out.print("가 최종 우승했습니다!");
	}

	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		Carinit pp = new Carinit();

		System.out.println("경주할 자동차의 이름은 무엇 인가요? ex)pobi, riverway");
		String inputName = input.nextLine();
		String[] names = inputName.split(",");

		System.out.println("시도할 횟수는 몇 회 인가요?");
		int num = input.nextInt();
		
		Car[] win = pp.CarName(names);
		pp.run(names.length, num, win);
		pp.winCar(pp.maxCar(win), win);

		

	}
}