package racingcar_step3;

import java.util.Scanner;

public class RacingCar {
	
	public Car[] makeCar(String[] names) {
		Car car[] = new Car[names.length];//자동차 개수 만큼 배열 생성
		for (int i = 0; i < names.length; i++) {
			car[i] = new Car(names[i]);//자동차 생성해서, 배열에 넣기
		}
		return car;
	}
	
	public static void main(String[] args) {
		RacingCar rc = new RacingCar();
		InputView iv = new InputView();
		ResultView rv = new ResultView();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("경주할 자동차 이름을 입력하세요(이름은 쉼표(,)를 기준으로 구분.)");
		String inputNames = iv.input(sc);
		String[] names = iv.splitNames(inputNames);

		Car[] car = rc.makeCar(names);
		
		System.out.println("시도할 회수는 몇회 인가요? : ");
		int tryNumber = sc.nextInt();
		
		rv.repeatTryNumber(tryNumber, rc, car);
		
		int goldMedalScore = rv.findGoldMedalScore(car);
		rv.printGoldMedal(goldMedalScore, car);
		
	}//main
}
