package car;
import java.util.ArrayList;
import java.util.Arrays;

public class RacingCar {
	//자동차의 이름 배열을 입력받아서, 그 이름으로 '차' 객체를 각각 생성한 뒤, 리턴.
	private static ArrayList<Car> initializeCar(ArrayList<String> carNameList, ArrayList<Car> cars) {
		for (int i = 0; i < carNameList.size(); i++) {
			cars.add(i, new Car(carNameList.get(i)));
		}
		return cars;
	}
	//입력 받은 이름을 "," 기준으로 나눠 각각 배열의 다른 칸으로 넣어주는 메소드. 입력이 끝난 이름 배열을 리턴해준다.
	private static String[] splitName(String carName) {
		return carName.split(",");
	}
	//race를 시작하는 부분. 1 턴 동안에 car 객체들을 움직이거나 정지하게 하고, 변경된 상태를 리턴한다.
	private static ArrayList<Integer> startRace(ArrayList<Car> car) {
		ArrayList<Integer> carLocation = new ArrayList<Integer> (car.size());
		for (int i = 0; i < car.size(); i++) {
			carLocation.add(i, car.get(i).move());
		}
		return carLocation;
	}
	//car 객체들의 이동거리 중에서 가장 큰 값을 반환.
	private static int returnBiggest(int distance, int biggest) {
		if (distance > biggest) {
			return distance;
		}
		return biggest;
	}
	//모든 car 객체들의 이동거리 중에서 최대값을 구해 리턴한다.
	private static int findBiggest(ArrayList<Integer> distance) {
		int biggest = 0;
		for (int i = 0; i < distance.size(); i++) {
			biggest = returnBiggest(distance.get(i), biggest);
		}
		return biggest;
	}
	//main start
	public static void main(String[] args) {
		InputView.inputNameMessage();
		String inputName = InputView.takeName();		//이름을 입력 받는다.
		InputView.inputNumMessage();
		int inputNum = InputView.takeNum();			//횟수를 입력 받는다.
		
		ArrayList<String> carNameList = new ArrayList<String>(Arrays.asList(splitName(inputName)));		//","를 기준으로 단어를 나누어 ArrayList에 저장.
		ArrayList<Car> cars = new ArrayList<Car>();
		cars = initializeCar(carNameList, cars);		//입력받은 이름 수 만큼 car 객체를 생성하고, cars 배열에 채워 넣는다.	
		ArrayList<Integer> carStatus = new ArrayList<Integer> ();		//자동차의 이동한 위치 상태를 알 수 있는 ArrayList 생성.
		
		for (int i = 0; i < inputNum; i++) {
			carStatus = startRace(cars);		//car객체들을 1턴 움직이고 상태를 최신화
			ResultView.draw(carNameList, carStatus);		//최신화 된 car객체의 상태를 출력
		}
		int biggest = findBiggest(carStatus);
		ResultView.printWinner(biggest, cars);
	}
}
