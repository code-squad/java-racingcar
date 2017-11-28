package car;

import static org.junit.Assert.*;

import org.junit.Test;

public class CarTest {
	@Test
	public void getNameTest() {
		Car testCar = new Car("Pobi");
		assertEquals("Pobi",testCar.getName());
	}
	
	@Test
	public void getPosTest() {
		Car testCar = new Car("Pobi");
		assertEquals(0,testCar.getPos());		//초기값 0이 들어갔는지 테스트
	}
	
	@Test
	public void isCarMoveTest() {
		assertFalse("4보다 작지만 움직였네요.", Car.isCarMove(3));		//random 숫자가 4 보다 작을 때, 정지하는지 확인.
		assertTrue("4이상 이지만 정지했네요.", Car.isCarMove(6));		//random 숫자가 4 이상일 때, 움직이는지 확인.
	}
	
	@Test
	public void moveTest() {
		Car testCar = new Car("Pobi");
		assertEquals(0, testCar.move(1));		//random 숫자가 1일 때 (4보다 작을 때) position값이 변했는지 확인.
		assertEquals(1, testCar.move(8));		//random 숫자가 1일 때 (4보다 작을 때) position값이 변했는지 확인.
	}
}
