package racingcar;

public class ResultView {
	public static void getWinner(Car[] car, int winner) {
		for(int i=0; i<car.length;i++) {
			if(winner==car[i].getPosition()) {
				System.out.print(car[i].getName() + " ");
			}
		}
		System.out.println("가 최종 우승하였습니다.");
	}
}
