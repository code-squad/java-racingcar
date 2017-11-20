
import java.util.Random;
import java.util.Scanner;

import javax.swing.plaf.synth.SynthSeparatorUI;

public class CarRacing {
	public String[] getNames() {
		System.out.println("이름을 입력하세요(ex : will,pobi,honux)");
		Scanner sc = new Scanner(System.in);
		String temp = sc.nextLine();
		String[] names = temp.split(",");
		return names;
	}
	
	public int[] getCarPositions(String[] names) {
		int[] carPositions = new int[names.length];
		for (int i = 0; i < names.length; i++) {
			carPositions[i] = 1;
		}
		return carPositions;
	}
	
	public int getTime() {
		System.out.println("시도할 회수는 몇 회인가요?");
		Scanner sc = new Scanner(System.in);
		int temp = sc.nextInt();
		if (!(temp > 0)) {
			System.out.println("양의 정수로 다시 입력하세요");
			getTime();
			return -1;
		}
		return temp;
	}
	
	public int makeRandomNum() {
		Random random = new Random();
		int randomNum = random.nextInt(10);
		if (randomNum >= 4) {
			return 1;
		}
		return 0;
	}
	
	public int[] run(int[] carPositions) {
		for (int i = 0; i < carPositions.length; i++) {
			carPositions[i] += makeRandomNum();
		}
		return carPositions;
	}
	
	public String[] makeMarkDash(int[] carPositions, int j) {
		String[] markDash = new String[carPositions.length];
		for (int i = 0; i < carPositions.length; i++) {
			markDash[i] = "-";
		}
		for (int i = 0; i < carPositions[j] - 1; i++) {
			markDash[j] += "-";
		}
		return markDash;
	}
	
	public void show(int[] carPositions, String[] names) {
		run(carPositions);
		for (int i = 0; i < carPositions.length; i++) {
			System.out.println(names[i] + " : " + makeMarkDash(carPositions, i)[i]);
		}
	}
	
	public void showNTimes(int times, int[] carPositions, String[] names) {
		for (int i = 0; i < times; i++) {
			show(carPositions, names);
			System.out.println("");
		}
	}
	
	public static void main(String[] args) {
		CarRacing carRacing = new CarRacing();
		String[] names = carRacing.getNames();
		int times = carRacing.getTime();
		int[] carPositions = carRacing.getCarPositions(names);
		carRacing.showNTimes(times, carPositions, names);
	}
}
	
	
