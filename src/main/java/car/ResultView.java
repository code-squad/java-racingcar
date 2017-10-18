package car;

import java.util.List;

public class ResultView {
	public void oneCarPrint(int runNum, String carName) {
		StringUtils util = new StringUtils();
		System.out.print(carName + ":");
		util.repeat("-", runNum);
		System.out.print("\n");
	}
	
	public void printWinner(List<String> winner) {
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
