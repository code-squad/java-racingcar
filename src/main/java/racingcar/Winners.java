package racingcar;

import java.util.ArrayList;

public class Winners {
	static int getMax(CarArray carArray) {   // 우승자를 가리는 메서드
		int max = carArray.getCarArr()[0].getCounter();  // 0번째 인덱스의 인스턴스가 가장 많이 전진했다고 가정한다.
		
		
		for (int i = 1; i < carArray.getCarArr().length; i++) {   // 가장 많이 전진한 수를 구한다.
				if (max < carArray.getCarArr()[i].getCounter()) 
					max = carArray.getCarArr()[i].getCounter();
		}
		return max;
	}
	
	static ArrayList winners(CarArray carArray) {
		int max =  getMax(carArray);
		ArrayList winners = new ArrayList();   // 우승자를 저장할 ArrayList를 생성한다.
		for (int i = 0; i < carArray.getCarArr().length; i++) {   // 인스턴스의 counter가 max와 같다면  winners에 추가한다.
			if (max == carArray.getCarArr()[i].getCounter())
				winners.add(carArray.getCarArr()[i]);
		}
		return winners;
	}
}
