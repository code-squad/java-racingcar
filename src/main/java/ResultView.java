import java.util.List;

public class ResultView {
	// Racing 에 대한 결과출력.
	public void print(List<Car> cars){
		// 횟수당 처리결과 반환하기.
		for(Car oneTryResult : cars){
			System.out.println(oneTryResult.getName() + ":" + StringProcess.changeTo_(oneTryResult.getPosition()));
		}
	}
	
	public int printWinners(Racing racing, List<Car> lastTryResults){
		for(Car winnersCar : racing.findWinner(lastTryResults)){
			System.out.print(winnersCar.getName());
			if(racing.findWinner(lastTryResults).size() == 1){
				System.out.println("가 최종 우승했습니다.");
				return 0;
			}
			System.out.print(",");
		}
		System.out.println("가 공동 우승했습니다.");
		return 0;
	}
}