package racing;

import java.util.Random;
import java.util.Scanner;
import java.util.Arrays;

public class Carinit {

	private Car[] win;
    
	public Carinit(String[] names) {   //Car가 먼저 생성된 후에 Carinit 클래스를 사용할 수 있도록 한다.
		Car[] tt = new Car[names.length];
		for (int i = 0; i < names.length; i++) {
			tt[i] = new Car(names[i]);
		}
		this.win = tt;
	}
	
	public void run(int car, int num) {// 모든 차의 주행 거리를 표현
		for (int i = 0; i < car; i++) {
			win[i].oneCar(num);
		}
	}

	public void outName() {
		for (int i = 0; i < win.length; i++) {
			System.out.print(win[i].getName() + " : ");
			outPosition(win[i]);
		}
	}

	public void outPosition(Car win) {
		for (int i = 0; i < win.getPosition(); i++) {
			System.out.print("-");
		}
		System.out.println();
	}

	public int maxCar() {
		int max;
		int[] carn = new int[win.length];

		for (int i = 0; i < win.length; i++) {
			carn[i] = win[i].getPosition();
		}
		Arrays.sort(carn);
		max = carn[carn.length - 1]; // 정렬을 이용하여 큰 수를 max에 넣는다.

		return max;
	}

	public void winCar(int max) {
		for (int i = 0; i < win.length; i++) {
			if (win[i].matchPosition(max)) {
				System.out.print(win[i].getName() + " ");
			}
		}
		System.out.print("가 최종 우승했습니다!");
	}

	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("경주할 자동차의 이름은 무엇 인가요? ex)pobi, riverway");
		String inputName = input.nextLine();
		String[] names = inputName.split(",");

		System.out.println("시도할 횟수는 몇 회 인가요?");
		int num = input.nextInt();
		
		Carinit pp = new Carinit(names);
		
		pp.run(names.length, num);
		pp.outName();
		pp.winCar(pp.maxCar());
	}
}