package car;

public class RacingCar {
	//자동차의 이름 배열을 입력받아서, 그 이름으로 '차' 객체를 각각 생성한 뒤, 리턴.
	private static Car[] initializeCar(String[] carNameList) {
		Car[] cars = new Car[carNameList.length];
		for (int i = 0; i < carNameList.length; i++) {
			cars[i] = new Car(carNameList[i]);
		}
		
		return cars;
	}
	//입력 받은 이름을 "," 기준으로 나눠 각각 배열의 다른 칸으로 넣어주는 메소드. 입력이 끝난 이름 배열을 리턴해준다.
	private static String[] splitName(String carName) {
		return carName.split(",");
	}
	//race를 시작하는 부분. 1 턴 동안에 car 객체들을 움직이거나 정지하게 하고, 변경된 상태를 리턴한다.
	private static int[] startRace(Car[] car) {
		int[] carStatus = new int[car.length];
		for (int i = 0; i < car.length; i++) {
			carStatus[i] = car[i].move();
		}
		return carStatus;
	}
	//car 객체들의 이동거리 중에서 가장 큰 값을 반환.
	private static int returnBiggest(int distance, int temp) {
		if (distance > temp) {
			return distance;
		}
		return temp;
	}
	//모든 car 객체들의 이동거리 중에서 최대값을 구해 리턴한다.
	private static int findBiggest(int[] distance) {
		int biggest = 0;
		for (int i = 0; i < distance.length; i++) {
			biggest = returnBiggest(distance[i], biggest);
		}
		return biggest;
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
	//main start
	public static void main(String[] args) {
		ResultView.inputNameMessage();
		String inputName = InputView.takeName();		//이름을 입력 받는다.
		ResultView.inputNumMessage();
		int inputNum = InputView.takeNum();			//횟수를 입력 받는다.
		
		String[] carNameList = splitName(inputName);
		Car[] cars = initializeCar(carNameList);		//입력받은 이름 수 만큼 car 객체를 생성하고, cars 배열에 채워 넣는다.
		int[] carStatus = new int[cars.length];		//자동차의 이동 상태를 알 수 있는 배열 생성.
		
		for (int i = 0; i < inputNum; i++) {
			carStatus = startRace(cars);		//car객체들을 1턴 움직이고 상태를 최신화
			ResultView.draw(carNameList, carStatus);		//최신화 된 car객체의 상태를 출력
		}
		int biggest = findBiggest(carStatus);
		
		String winnerName;
		String[] winnerList = new String[carStatus.length];
		for (int i = 0; i < carStatus.length; i++) {
			winnerName = findWinner(cars, biggest, i);		//최대거리를 간 차가 맞다면 winnerName에 자동차의 이름을 넣는다.
			winnerList = makeWinnerList(winnerName, winnerList, i);		//자동차 이름을 winnerList에 넣는다.
		}
		for (int i = 0; i < winnerList.length; i++) {
			ResultView.noticeWinner(winnerList[i]);		//winnerList를 출력해준다.
		}
	}
}
