package racingcar;
import java.util.*;

public class CarDriver {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Random random = new Random();
		
		System.out.println("경주할 자동차 이름은 입력하세요. (이름은 쉽표(,)를 기준으로 구분)");
		String[] nameArr = Input.carName(scanner);   // 경기에 참가할 참가자의 이름을 입력한다.
		Car[] cars = CarArr.cars(nameArr);   // 각 참가자(인스턴스)를 생성한다.
		
		System.out.println("시도할 회수는 몇회인가요?");
		int tries = Input.tryNum(scanner);   // 총 몇번 시도할 것인지 입력한다.
		Run.run(cars, tries, random);   // 경기를 시작한다.
	
		Vector winners = Winners.winners(cars);   // 우승자를 가린다.
		Winners.resultView(winners);   // 우승자를 출력한다.
	}
}

class Car {
	String name;   // 자동차의 이름을 저장한다.
	int counter;   // 몇 번을 전진했는지 저장한다.
	
	Car(String name) {
		this.name = name;
	}
	
	public String toString() {   // 인스턴스 출력시  name을 반환
		return name;
	}
}


class CarArr {
	static Car[] cars(String[] nameArr) {   // Car타입의 객체배열을 생성하는 메서드   
		Car[] cars = new Car[nameArr.length];
		for (int i = 0; i < nameArr.length; i++) {
			cars[i] = new Car(nameArr[i]);
		}
		return cars;
	}
}

class Input {
	static String[] carName(Scanner scanner) {   // 자동차 이름의 문자열배열을 만드는 메서드
		String name = scanner.nextLine();
		String[] nameArr = name.split(",");
		return nameArr;
	}
	
	static int tryNum(Scanner scanner) {   // 시도할 횟수를 입력하는 메서드
		int tries = scanner.nextInt();
		return tries;
	}
}

class Run {
	static void run(Car[] cars, int tries, Random random) {   // 각 인스턴스의 전진횟수를 보여주는 메서드
		System.out.println("실행 결과");
		for (int i = 0; i< cars.length; i++)
			run2(i, cars, tries, random);
	}

	static void run2(int i, Car[] cars, int tries, Random random) {
		System.out.print(cars[i] + " : ");
		for(int j = 0; j < tries; j++) {
			int rnd = RanNum.rndNum(random);
			if (rnd > 3) {
				System.out.print("-");
				cars[i].counter++;
			}
		}
		System.out.println();
	}
}

class RanNum {
	static int rndNum(Random random) {   // 랜덤번호 메서드
		int rnd = random.nextInt(10);
		return rnd;
	}
}

class Winners {
	static Vector winners(Car[] cars ) {   // 우승자를 가리는 메서드
		int max = cars[0].counter;  // 0번째 인덱스의 인스턴스가 가장 많이 전진했다고 가정한다.
		Vector winners = new Vector();   // 우승자를 저장할  Vector
		
		for (int i = 1; i < cars.length; i++) {   // 가장 많이 전진한 수를 구한다.
				if (max < cars[i].counter) 
					max = cars[i].counter;
			}
		
		for (int i = 0; i < cars.length; i++) {   // 가장 많이 전진한 수와 인스턴스의 전진한 수가 같다면 위너스배열에 넣는다.
			if (max == cars[i].counter)
				winners.add(cars[i]);
		}
		return winners;
	}	
	
	static void resultView(Vector winners) {   // 경기결과를 알려주는 메서드
		for (int i = 0; i < winners.size(); i++) { 
			Car car = (Car)winners.get(i);
			System.out.print(car.name + ", "); // 끝에 ,가 붙을 수 밖에 없는데 어떻게 해결하나? 
		}
		
		System.out.println("이/가 최종우승했습니다.");
	}
}
