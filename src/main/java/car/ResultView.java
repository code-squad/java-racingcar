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
	public static void noticeWinner(ArrayList<Car> winner) {
		for (int i = 0; i < winner.size(); i++) {
			System.out.println("우승자는 " + winner.get(i).getName() + " 입니다.");
		}
	}
	//winner를 winnerList에 추가해주는 메소드.
	private static ArrayList<Car> addWinner(ArrayList<Car> winner, ArrayList<Car> cars, int count, int biggest) {
		if (cars.get(count).getPos() == biggest) {
			winner.add(cars.get(count));
		}
		return winner;
	}
	//우승자 목록을 만들어주는 메소드. 우승자 이름을 입력받는다.
	private static ArrayList<Car> makeWinnerList(ArrayList<Car> cars, int biggest) {
		ArrayList<Car> winnerList = new ArrayList<Car> ();
		for (int i = 0; i < cars.size(); i++) {
			winnerList = addWinner(winnerList, cars, i, biggest);
		}
		return winnerList;
	}
	//winner 리스트를 만들어주고, 만들어진 리스트를 출력해준다.
	public static void printWinner(int biggest, ArrayList<Car> cars) {
		ArrayList<Car> winnerCars = makeWinnerList(cars, biggest);
		noticeWinner(winnerCars);		//winnerList를 출력해준다.
	}
}
