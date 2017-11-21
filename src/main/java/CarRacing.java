
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;


public class CarRacing {
	public static void main(String[] args) {
		Input input = new Input();
		String[] names = input.getNames();
		int time = input.getTime();
		Car[] cars = new Car[names.length];
		for (int i = 0; i < names.length; i++) {
			cars[i] = new Car(names[i]);
		}
		showNTimes(time, names, cars);
		showWinner(cars);
	}
	
	public static void show(String[] names, Car[] cars) {
		for (int i = 0; i < names.length; i++) {
			System.out.println(cars[i].getName() +  " : " + cars[i].makeDash());
		}
	}
	
	public static void showNTimes(int time, String[] names, Car[] cars) {
		for (int i = 0; i < time; i++) {
			show(names, cars);
			System.out.println("");
		}
	}
	
	public static void showWinner(Car[] cars) {
		int[] positions = new int[cars.length];
		for (int i = 0; i < cars.length; i++) {
			positions[i] = cars[i].getPosition();
		}
		Arrays.sort(positions);
		System.out.print("최종 우승자 : ");
		for (int i = 0; i < cars.length; i++) {
			if(positions[positions.length - 1] == cars[i].getPosition()) {
				System.out.print(cars[i].getName() + " ");
			}
		}
	}
}
	
	
