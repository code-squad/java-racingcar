package car;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

public class RacingCarTest {
	@Test
	public void initializeCarTest() {
		ArrayList<String> testNameList = new ArrayList<String> ();
		ArrayList<Car> testCarList = new ArrayList<Car> ();
		
		testNameList.add("a");		//4개의 Car객체를 생성하고 (이름을 a,b,c,d로 생성)
		testNameList.add("b");
		testNameList.add("c");
		testNameList.add("d");
		
		for (int i = 0; i < 4; i++) {
			//a,b,c,d 이름으로 Car객체를 만들었는지 확인.
			assertEquals(testNameList.get(i), RacingCar.initializeCar(testNameList, testCarList).get(i).getName());
			
			//a,b,c,d 라는 이름을 가진 Car 객체 모두 position 이 0 으로 잘 초기화 되었는지 확인.
			assertEquals(0, RacingCar.initializeCar(testNameList, testCarList).get(i).getPos());
		}
	}
	
	@Test
	public void returnBiggestTest() {
		int big = 10;
		int small = 5;
		
		assertEquals(10, RacingCar.returnBiggest(big, small));		//더 큰 값이 리턴되는지 확인.
		assertEquals(10, RacingCar.returnBiggest(small, big));
	}
	
	@Test
	public void findBiggestTest() {
		ArrayList<Integer> testList = new ArrayList<Integer> ();		//여러 숫자값(position값)을 testArrayList에 넣어주고,
		testList.add(10);
		testList.add(80);
		testList.add(30);
		testList.add(60);
		testList.add(70);
		testList.add(90);
		testList.add(80);
		
		assertEquals(90, RacingCar.findBiggest(testList));		//그 중 최댓값인 90이 리턴되는지 확인.
	}
}
