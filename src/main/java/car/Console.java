package car;

import java.util.List;
import java.util.Scanner;

public class Console {

	public String[] getNames(Scanner sc) {
		System.out.println("경주할 자동차 이름을 입력하세요(이름은 쉼표(,)를 기준으로 구분).");
		String  carNames = sc.nextLine();
		String[] carNamesArr = carNames.split(",");
		return carNamesArr;
	}

	public int getTurn(Scanner sc) {
		System.out.println("시도할 회수는 몇 회 인가요?");
		int turnNum = sc.nextInt();
		return turnNum;
	}

	public void oneCarPrint(int runNum, String carName) {
		System.out.print(carName + ":");
		for(int i=0; i < runNum; i++ ) {
			System.out.print("-");
		}
		System.out.print("\n");
	}
	
	public void printWinner(List<Car> carList, List<String> winner) {
		if(winner.size() > 0) {
			System.out.print(winner.get(0));
			for(int i=1; i < winner.size(); i++) {
				System.out.print("와 ");
				System.out.print(winner.get(i));
			}
		}
		System.out.print("가 최종 우승했습니다.");
	}
}
