package car.race;

public class CarRaceMain {

	public static void main(String[] args) {
		
		System.out.println("경주할 자동차 이름을 입력하세요 (이름은 쉼표(,)를 기준으로 구분).");
		String[] names = Input.askNames();
		System.out.println("시도할 횟수는 몇 인가요?");
		int numMoves = Input.askNumberofMoves();
		
		CarRace.startRace(names, numMoves);
	}
}
