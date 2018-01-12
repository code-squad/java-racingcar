package com.mrblue.codesquad.javaracingcar;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static com.mrblue.codesquad.testutil.TestUtil.*;

/**
 * Created by kineo2k on 2018. 1. 6..
 * Email : kineo2k@gmail.com
 */
public class RacingGameTest {
	private RacingGame game;

	@Before
	public void setup() {
		this.game = new RacingGame();
	}

	// TODO: IllegalArgumentException으로 체크 해야하지만, TestUtil
	@Test(expected = RuntimeException.class)
	public void test_toInt_isBlank() {
		assertEquals(0, invokeMethod(RacingGame.class, "toInt", int.class, String.class, "").intValue());
		assertEquals(0, invokeMethod(RacingGame.class, "toInt", Integer.class).intValue());
		assertEquals(0, invokeMethod(RacingGame.class, "toInt", int.class, String.class, "1a2b").intValue());
	}

	@Test
	public void test_toInt() {
		assertEquals(10, invokeMethod(RacingGame.class, "toInt", int.class, String.class, "10").intValue());
		assertEquals(-1, invokeMethod(RacingGame.class, "toInt", int.class, String.class, "-1").intValue());
	}
}
