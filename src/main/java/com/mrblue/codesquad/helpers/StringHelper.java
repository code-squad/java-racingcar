package com.mrblue.codesquad.helpers;

/**
 * Created by kineo2k on 2018. 1. 12..
 * Email : kineo2k@gmail.com
 */
public class StringHelper {
	private StringHelper() {
	}

	public static boolean isNullOrEmpty(final String text) {
		return text == null || text.isEmpty();
	}
}
