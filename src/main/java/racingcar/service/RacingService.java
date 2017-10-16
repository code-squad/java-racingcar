package racingcar.service;

import java.util.List;
import java.util.Random;
import java.util.Scanner;

import racingcar.model.Car;
import racingcar.model.Racing;

public class RacingService {
	private CarService carService = new CarService();
	public Racing setRacing() {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("경주할 자동차 이름을 입력하세요(이름은 쉼표(,)를 기준으로 구분).");
		List<Car> carList = carService.parseCar(scan.nextLine());
		
		System.out.println("시도할 회수는 몇 회 인가요?");
		int moveCount = convertScanString(scan.nextLine());
		
		scan.close();
		return new Racing(carList, moveCount);
	}
	
	public void startRacing(Racing racing) {
		List<Car> carList = racing.getCars();
		carService.carsMove(carList, racing.getMoveCount());
		printResult(carList);
	}
	
	public void printResult(List<Car> carList) {
		for(int i=0; i<carList.size(); i++) {
			System.out.print(carList.get(i).getCarName()+" : ");
			for(int j=0; j<carList.get(i).getPosition(); j++) {
				System.out.print("-");
			}
			System.out.println();
		}
	}
	
	public int convertScanString(String scanString) {
		int returnValue = 0;
		
		try {
			returnValue = Integer.parseInt(scanString);			
		}catch(Exception e) {
			System.out.println("숫자 입력이 잘못 되었습니다.");
		}
		return returnValue;		
	}

}
