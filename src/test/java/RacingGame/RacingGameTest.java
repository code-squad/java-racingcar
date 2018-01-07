package RacingGame;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

import java.util.Random;

import org.junit.Before;
import org.junit.Test;

public class RacingGameTest {
	RacingGame game;
	
	@Before
	public void setup(){
		game = new RacingGame();
	}
	
	@Test
	public void totalMoveYn() {
		int[] carPositions = {0,0,0};
		int[] randomArray = {4,5,2};
		int carCounts = 3;
		int[] result = {1, 1, 0};
		assertArrayEquals(result, game.totalMoveCnt(randomArray, carCounts, carPositions));
	}

	@Test
	public void moveYn_N() {
		assertEquals(4, game.moveYn(3, 4));
	}

	@Test
	public void moveYn_Y() {
		assertEquals(5, game.moveYn(5, 4));
	}
}