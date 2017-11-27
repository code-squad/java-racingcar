package car;
import java.util.ArrayList;

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
	public static void draw(ArrayList<String> name, ArrayList<Integer> carDistance) {
		System.out.println("--------------------------START--------------------------");
		for (int i = 0; i < carDistance.size(); i++) {
			drawEachCar(name.get(i), carDistance.get(i));
		}
	}
	//최종 우승자를 출력해주는 메소드.
	public static void noticeWinner(ArrayList<String> winner) {
		for (int i = 0; i < winner.size(); i++) {
			System.out.println("우승자는 " + winner.get(i) + " 입니다.");
		}
	}
	//우승자 목록을 만들어주는 메소드. 우승자 이름을 입력받는데, null값이 입력되면 리스트에 넣지 않는다.
	private static ArrayList<String> makeWinnerList(ArrayList<Car> cars, int biggest, int i, ArrayList<String> winnerList) {
		if (cars.get(i).getPos() == biggest) {
			winnerList.add(cars.get(i).getName());
		}
		return winnerList;
	}
	//winner 리스트를 만들어주고, 만들어진 리스트를 출력해준다.
	public static void printWinner(int biggest, ArrayList<Car> cars) {
		ArrayList<String> winnerList = new ArrayList<String>();
		for (int i = 0; i < cars.size(); i++) {
			winnerList = makeWinnerList(cars, biggest, i, winnerList);		//최대거리를 간 자동차 이름을 winnerList에 넣는다.
		}
		noticeWinner(winnerList);		//winnerList를 출력해준다.
	}
}
