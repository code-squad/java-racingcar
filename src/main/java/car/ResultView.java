package car;

public class ResultView {
	//각각의 차들의 현재 position값만큼 "-"문자를 출력해주는 메소드.
	public static void drawEachCar(String name, int numToDraw) {
		String result = "-";
		int drawCount = numToDraw;
		while (drawCount > 0) {
			result += "-";
			drawCount--;
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
	//최종 우승자를 출력해주는 메소드.
	public static void noticeWinner(String carName) {
		if (carName != null) {
			System.out.println("우승자는 " + carName + " 입니다.");
		}
	}
	//우승자 목록을 만들어주는 메소드. 우승자 이름을 입력받는데, null값이 입력되면 리스트에 넣지 않는다.
	private static String[] makeWinnerList(String carName, String[] winnerList, int i) {
		if (carName != null) {
			winnerList[i] = carName;
		}
		return winnerList;
	}
	//car객체의 이동거리를 최대 이동거리와 비교하여 같다면, 최대거리를 간 자동차의 이름을 리턴해주는 메소드.
	private static String findWinner(Car[] cars, int biggest, int i) {
		if (cars[i].getPos() == biggest) {
			return cars[i].getName();
		}
		return null;		//최대거리를 간 차가 아니라면, null값 리턴.
	}
	public static void printWinner(int biggest, Car[] cars) {
		String winnerName;
		String[] winnerList = new String[cars.length];
		for (int i = 0; i < cars.length; i++) {
			winnerName = findWinner(cars, biggest, i);		//최대거리를 간 차가 맞다면 winnerName에 자동차의 이름을 넣는다.
			winnerList = makeWinnerList(winnerName, winnerList, i);		//자동차 이름을 winnerList에 넣는다.
		}
		for (int i = 0; i < winnerList.length; i++) {
			noticeWinner(winnerList[i]);		//winnerList를 출력해준다.
		}
	}
}
