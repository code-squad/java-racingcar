package racingcar;

public class Car {
<<<<<<< HEAD
	private String name;   // 자동차의 이름
	private int counter;   // 전진한 횟수를 저장한다.
	
	Car(String name) {
		this.name = name;
	}
	
	public String toString() {   // 인스턴스를 출력하면 인스턴스의 name이 리턴
		return name;
	}
	
	void setName(String name) {  
		this.name = name;
=======
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Random random = new Random();
		

		System.out.println("자동차 대수는 몇대인가요?");
		String[] carName = carArr(scanner);
		System.out.println("시도할 횟수는 몇 회 인가요?");
		int tries = tryNum(scanner);
		run(carName, tries, random);
	}
	
	static String[] carArr(Scanner scanner) {   // 자동차이름 문자열 배열 메서드
		int cars = scanner.nextInt();
		String[] name = new String[cars];
		return name;
>>>>>>> caleb0308
	}
	
	String getName() {
		return name;
	}
	
	void setCounter(int counter) {
		this.counter = counter;
	}
	
<<<<<<< HEAD
	int getCounter() {
		return counter;
=======

	static void run(String[] carArr, int tries, Random random) {   // 주행메서드
		for (int i = 0; i < carArr.length; i++) {
			run2(tries, random);
		}
			
>>>>>>> caleb0308
	}
	
	static void run2(int tries, Random random) {  // 주행메서드 2
		for (int j = 0; j < tries; j++) {
			int rnd = rndNum(random);
			if (rnd > 3) {
				System.out.print("-");
			}
		}
		System.out.println();
	}
}
