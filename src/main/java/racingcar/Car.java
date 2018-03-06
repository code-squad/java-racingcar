package racingcar;

public class Car {
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

	}
	
	String getName() {
		return name;
	}
	
	void setCounter(int counter) {
		this.counter = counter;
	}
	
	int getCounter() {
		return counter;
	}
}
