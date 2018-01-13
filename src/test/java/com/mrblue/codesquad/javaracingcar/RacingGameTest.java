package com.mrblue.codesquad.javaracingcar;

import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;
import static com.mrblue.codesquad.helpers.TestHelper.*;

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

	@Test
	public void test_parseNamesOfCar_correctAnswer() {
		final List<String> answer = Arrays.asList("apple", "google", "facebook");

		String inputText = "apple,google,facebook";
		List   result    = invokeMethod(RacingGame.class, "parseNamesOfCar", List.class, String.class, inputText);
		assertTrue(answer.equals(result));

		inputText = "apple, google, facebook";
		result = invokeMethod(RacingGame.class, "parseNamesOfCar", List.class, String.class, inputText);
		assertTrue(answer.equals(result));

		inputText = ",,,,,,,,apple,,,,,,,google,,,,,,,facebook,,,,,,,,";
		result = invokeMethod(RacingGame.class, "parseNamesOfCar", List.class, String.class, inputText);
		assertTrue(answer.equals(result));
	}

	@Test
	public void test_parseNamesOfCar_wrongAnswer() {
		final List<String> answer = Arrays.asList("apple", "google", "facebook");

		String inputText = "apple,google";
		List   result    = invokeMethod(RacingGame.class, "parseNamesOfCar", List.class, String.class, inputText);
		assertFalse(answer.equals(result));

		inputText = "apple,google,facebook,microsoft";
		result = invokeMethod(RacingGame.class, "parseNamesOfCar", List.class, String.class, inputText);
		assertFalse(answer.equals(result));

		inputText = "apple google facebook";
		result = invokeMethod(RacingGame.class, "parseNamesOfCar", List.class, String.class, inputText);
		assertFalse(answer.equals(result));

		inputText = "orange,alphabet,cyworld";
		result = invokeMethod(RacingGame.class, "parseNamesOfCar", List.class, String.class, inputText);
		assertFalse(answer.equals(result));
	}
}
