import java.util.Random;
import java.util.Scanner;

public class RacingCar {
	//자동차의 이름 배열을 입력받아서, 그 이름으로 '차' 객체를 각각 생성한 뒤, 리턴.
	static Car[] initializeCar(String[] carNameList) {
		Car[] cars = new Car[carNameList.length];
		for (int i = 0; i < carNameList.length; i++) {
			cars[i] = new Car(carNameList[i]);
		}
		
		return cars;
	}
	//입력 받은 이름을 "," 기준으로 나눠 각각 배열의 다른 칸으로 넣어주는 메소드. 입력이 끝난 이름 배열을 리턴해준다.
	public static String[] splitName(String carName) {
		String[] carStatus = carName.split(",");
		
		return carStatus;
	}
	
	//main start
	public static void main(String[] args) {
		ResultView.inputNameMessage();
		String inputName = InputView.takeName();		//이름을 입력 받는다.
		ResultView.inputNumMessage();
		int inputNum = InputView.takeNum();			//횟수를 입력 받는다.
		
		String[] carNameList = splitName(inputName);
		Car[] cars = initializeCar(carNameList);	//입력받은 이름 수 만큼 car 객체를 생성하고, cars 배열에 채워 넣는다.
		int[] carStatus = new int[cars.length];		//자동차의 이동 상태를 알 수 있는 배열 생성.
		
		for (int i = 0; i < inputNum; i++) {
			carStatus = Car.startRace(cars, inputNum);
			ResultView.draw(carNameList, carStatus);
		}
		
		Car.printWinner(carStatus);
	}
}
