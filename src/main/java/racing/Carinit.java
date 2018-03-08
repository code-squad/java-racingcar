package racing;

import java.util.Random;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;

public class Carinit {

	private Car[] win;
	private int max = 0;
	
	public Carinit(Car[] cars) { // Car가 먼저 생성된 후에 Carinit 클래스를 사용할 수 있도록 한다.
		this.win = cars;
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

	public int[] maxCar() { // Max 값을 구하기 위하여 Position 값이 든 배열 복제
		int[] carn = new int[win.length];

		for (int i = 0; i < win.length; i++) {
			carn[i] = win[i].getPosition();
		}
		return carn;
	}

	public void pushMax(int[] arrays) { // Max 값을 구한다.
		Arrays.sort(arrays);
		this.max = arrays[arrays.length - 1]; // 정렬을 이용하여 큰 수를 max에 넣는다.
	}

	public ArrayList<String> winCar() { // Position이 Max인 car을 배열에 넣어준다.
		ArrayList<String> wincar = new ArrayList<>();

		for (int i = 0; i < win.length; i++) {
			if (win[i].matchPosition(max)) {
				wincar.add(win[i].getName());
			}
		}
		return wincar;
	}

	public void printWinCar(ArrayList<String> wincar) { // 우승자 출력을 위한 메소드
		for (int i = 0; i < wincar.size(); i++) {
			System.out.print(wincar.get(i) + " ");
		}
		System.out.print("가 최종 우승했습니다. ");
	}
	
	public int getMax() {
		return max;
	}

	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);

		System.out.println("경주할 자동차의 이름은 무엇 인가요? ex)pobi, riverway");
		String inputName = input.nextLine();
		String[] names = inputName.split(",");

		System.out.println("시도할 횟수는 몇 회 인가요?");
		int num = input.nextInt();
		CarName name = new CarName();
		Carinit pp = new Carinit(name.makeCar(names));

		pp.run(names.length, num);
		pp.outName();
		pp.pushMax(pp.maxCar());
		pp.printWinCar(pp.winCar());
	}
}