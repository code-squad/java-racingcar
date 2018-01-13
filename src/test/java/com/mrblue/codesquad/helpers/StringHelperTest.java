package com.mrblue.codesquad.helpers;

import org.junit.Test;

import static org.junit.Assert.*;
import static com.mrblue.codesquad.helpers.StringHelper.*;

/**
 * Created by kineo2k on 2018. 1. 12..
 * Email : kineo2k@gmail.com
 */
public class StringHelperTest {
	@Test
	public void test_isNullOrEmpty() {
		assertTrue(isNullOrEmpty(null));
		assertTrue(isNullOrEmpty(""));
		assertFalse(isNullOrEmpty(" "));
		assertFalse(isNullOrEmpty("abc123"));
	}
}
