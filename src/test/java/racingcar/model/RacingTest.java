package racingcar.model;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class RacingTest {
	Racing racing1 = new Racing("1,2,3,4,5", 5);
	Racing racing2 = new Racing("a,b,c,d,e", 3);
	Racing racing3 = new Racing("ㄱ,ㄴ,ㄷ,ㄹ,ㅁ", 2);
	Racing racing4 = new Racing("A,B,C,D,E", 8);

	@Test
	public void testRacingConstructor() {
		assertEquals(5, racing1.getMoveCount());
		assertEquals(3, racing2.getMoveCount());
		assertEquals(2, racing3.getMoveCount());
		assertEquals(8, racing4.getMoveCount());
	}

	@Test
	public void testRacingListString() {
		assertEquals("1,2,3,4,5", racing1.getCars().getListString());
		assertEquals("a,b,c,d,e", racing2.getCars().getListString());
		assertEquals("ㄱ,ㄴ,ㄷ,ㄹ,ㅁ", racing3.getCars().getListString());
		assertEquals("A,B,C,D,E", racing4.getCars().getListString());
	}
}
