package racing;

import static org.junit.Assert.*;
import org.junit.Test;
import java.util.ArrayList;
import java.util.Random;

import org.junit.Before;


public class CarTest {
	
	private Carinit fast;
	private Car[] car2 = null;
	private Car test1;
	private Car test2;
	private Car test3;
	private Car test4;

	@Test
	public void testMax() {// Position 값이 가장 큰 값을 찾는 메소드를 테스트
		test1 = new Car("1");
		test2 = new Car("2");
		test3 = new Car("3");
		test4 = new Car("4");
		car2 = new Car[] {test1, test2, test3, test4};
		fast = new Carinit(car2);
	car2[1].move(5);
		int[] arrays = new int[] { 0, 1, 0, 0 };
		fast.pushMax(arrays); // pushMax에서는 arrays를 정렬한 후 배열의 마지막 값을 max에 넣어 준다.
		assertEquals(1, fast.getMax()); // 가장 큰 수와 비교

	}

	@Test
	public void testWinner() {// 가장 큰 위치 값을 찾는 자동차의 목록을 구하는 메소드 테스트
		test1 = new Car("1");
		test2 = new Car("2");
		test3 = new Car("3");
		test4 = new Car("4");
		car2 = new Car[] {test1, test2, test3, test4};
		fast = new Carinit(car2);
		car2[0].move(5);
		car2[0].move(5);
		int[] pushposition = new int[] {2, 0, 0, 0};
		
		fast.pushMax(pushposition);  //max 값이 생성된다.
		
		ArrayList<String> winners = new ArrayList<>();
		winners.add("1");

		assertEquals(winners,fast.winCar());
	}
}
