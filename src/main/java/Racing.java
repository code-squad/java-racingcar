import java.util.ArrayList;
import java.util.List;

public class Racing {
	List<Car> cars = new ArrayList<Car>();
	// 사용자 입력 개수만큼 car 객체생성.
	
	public Racing (List<String> carNames){
		for(String carName : carNames){
			Car car = new Car(carName);
			cars.add(car);
		}
	}
	
	public List<Car> doOneTry(){
		// 한번 실행결과 값을 반환.
		for(Car car : cars){
			car.run();
		}
		return cars;
	}
	// 2. 최종우승자 구하기.
	public int findMaxRecord(List<Car> lastTryResults){
		int maxRecord = lastTryResults.get(0).getPosition();
		for(Car lastTryresult : lastTryResults){
			if(maxRecord < lastTryresult.getPosition()){
				maxRecord = lastTryresult.getPosition();
			}
		}
		return maxRecord;
	}
	public List<String> findWinner(List<Car> lastTryResults){
		int maxRecord = findMaxRecord(lastTryResults);
		List<String> winners = new ArrayList<String>();
		for(Car lastTryResult : lastTryResults){
			if(maxRecord == lastTryResult.getPosition()){
				winners.add(lastTryResult.getName());
			}
		}
		return winners;
	}
}