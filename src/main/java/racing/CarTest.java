package racing;

import static org.junit.Assert.*;
import java.util.Random;
import org.junit.Test;
import org.junit.Before;

public class CarTest {
	Car car;
	
	@Before
	public void setTest(){
		car = new Car("a");
	}
	
	@Test
	public void testRand() { // 포지션이 증가 또는 멈춰있는지 확인 한다.
		//Car car = new Car("a");

		int pos = car.getPosition(); // move 하기 전의 Position 값
		Random ran = new Random();
		int r = ran.nextInt(9);

		System.out.println("First position : " + car.getPosition());
		System.out.println("랜덤 숫자 : " + r);
		if (r >= 4) {
			car.move(r);
			assertEquals(pos + 1, car.getPosition());
			System.out.println("랜덤 숫자가 4이상인 경우 - position : " + car.getPosition());
		} else {
			car.move(r);
			assertEquals(pos, car.getPosition());
			System.out.println("랜덤 숫자가 4이하인 경우 - position : " + car.getPosition());
		}
	}
	

	@Test
	public void testCheck() { //4이상이면 True를 반환하는지 확인한다.
		assertEquals(true, car.checkTrue(6));
		assertEquals(false, car.checkTrue(3));
	}
}
