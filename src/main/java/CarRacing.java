
import java.util.Random;
import java.util.Scanner;

import javax.swing.plaf.synth.SynthSeparatorUI;

public class CarRacing {
	private int time;
	private String[] carPositions;
	private String[] namesArr;
	
	
	public CarRacing() {	
		System.out.println("이름을 입력하세요( ex: will,pobi,honux)");
		Scanner sc = new Scanner(System.in);
		String names = sc.nextLine();
		this.namesArr = names.split(",");
		this.carPositions = new String[namesArr.length];
		for (int i = 0; i < namesArr.length; i++) {
			this.carPositions[i] = "-";
		}
	}
	
	public void setTime() {
		System.out.println("시도할 회수는 몇 회인가요?");
		Scanner sc = new Scanner(System.in);
		int temp = sc.nextInt();
		if (!(temp > 0)) {
			System.out.println("양의 정수로 다시 입력하세요");
			setTime();
			return;
		} else {
			this.time = temp;
		}
	}
	
	public int getTime() {
		return this.time;
	}
	
	public String makeRandomNum() {
		Random random = new Random();
		int randomNum = random.nextInt(10);
		if (randomNum >= 4) {
			return "-";
		}
		return "";
	}
	
	public void run() {
		for (int i = 0; i < this.carPositions.length; i++) {
			this.carPositions[i] += makeRandomNum();
			System.out.println(this.namesArr[i] + " : " + this.carPositions[i]);
		}
		System.out.println("");
	}
	
	public static void main(String[] args) {
		CarRacing carRacing = new CarRacing();
		carRacing.setTime();
		for (int i = 0; i < carRacing.getTime(); i++) {
			carRacing.run();
		}
	}
}
