package car;

public class ResultView {
	//경주 할 자동차의 이름을 입력하라는 메세지 출력.
	public static void inputNameMessage() {
		System.out.println("경주할 자동차 이름을 입력해 주세요.(이름은 쉼표(,)를 기준으로 구분합니다.)");
	}
	//시도 할 횟수를 입력하라는 메세지 출력.
	public static void inputNumMessage() {
		System.out.println("시도할 횟수는 몇 번 인가요?");
	}
	//각각의 차들의 현재 position값만큼 "-"문자를 출력해주는 메소드.
	public static void drawEachCar(String name, int num) {
		String result = "-";
		while (num > 0) {
			result += "-";
			num--;
		}
		System.out.println(name + " : " + result);
	}
	//각각의 차를 입력받은 수만큼 for loop안에서 찍어서 전체 차량의 1턴 이동을 찍어주는 메소드.
	public static void draw(String[] name, int[] carDistance) {
		System.out.println("--------------------------START--------------------------");
		for (int i = 0; i < carDistance.length; i++) {
			drawEachCar(name[i], carDistance[i]);
		}
	}
	
	public static void noticeWinner(String carName) {
		System.out.println("우승자는 " + carName + " 입니다.");
	}
}
