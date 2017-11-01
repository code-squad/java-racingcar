import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class RacingTest {
	Racing racing;
	
	@Before
	public void setUp(){
		List<String> carNames = Arrays.asList(
				new String("pobi"),
				new String("crong"),
				new String("honux"));
		racing = new Racing(carNames);
	}
	
	@Test
	public void findMaxRecordTest() {
		List<Car> lastTryResults = Arrays.asList(
				new Car("pobi", 7), 
				new Car("crong", 9),
				new Car("honux", 9));
		int maxRecord = racing.findMaxRecord(lastTryResults);
		assertEquals(9, maxRecord);
	}
	@Test
	public void findWinnersTest(){
		List<Car> lastTryResults = Arrays.asList(
				new Car("pobi", 7), 
				new Car("crong", 9),
				new Car("honux", 9));
		// new ArrayList<String>();
		//
		List<Car> winners = racing.findWinner(lastTryResults);
		assertEquals(Arrays.asList(new Car("crong", 9),
				                   new Car("honux", 9)), winners);
	}

}
