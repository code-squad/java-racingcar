package model;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Racing {
	List<Car> cars = new ArrayList<Car>();
	// 사용자 입력 개수만큼 car 객체생성.
	public Racing (List<Car> cars){
		this.cars = cars;
	}
	public void doOneTry(){
		// 한번 실행결과 값을 반환.
		for(Car car : cars){
			car.run();
		}
	}
	
	public List<Car> getCars() {
		return cars;
	}

	public List<Car> doOneTry1(){
		// 한번 실행결과 값을 반환.
		for(Car car : cars){
			car.run();
		}
		return cars;
	}
	
	// 2. 최종우승자 구하기.
	public int findMaxRecord(List<Car> lastTryResults){
		// list에 대한 stream 생성.
		// list 에 대한 최대값 구하기.
		Car car = lastTryResults.stream().max((Car car1, Car car2) -> Integer.compare(car1.getPosition(), car2.getPosition())).get();
		int maxRecord = car.getPosition();
											
		return maxRecord;
	}
	
	public List<Car> findWinner(List<Car> lastTryResults){
		int maxRecord = findMaxRecord(lastTryResults);
		List<Car> winnersCar = lastTryResults.stream() // list 를 stream으로 전환
				.filter(car -> car.getPosition() == maxRecord) // filter the stream to create new stream
				.collect(Collectors.toList()); // collect the final stream and convert it to a list 
		return winnersCar;
	}
}