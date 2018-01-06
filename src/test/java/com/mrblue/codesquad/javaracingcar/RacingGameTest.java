package com.mrblue.codesquad.javaracingcar;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

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

	@Test(expected = IllegalArgumentException.class)
	public void test_toInt_isBlank() {
		assertEquals(0, game.toInt(""));
		assertEquals(0, game.toInt(null));
		assertEquals(0, game.toInt("1a2b"));
	}

	@Test
	public void test_toInt() {
		assertEquals(10, game.toInt("10"));
		assertEquals(10, game.toInt("-1"));
	}
}
