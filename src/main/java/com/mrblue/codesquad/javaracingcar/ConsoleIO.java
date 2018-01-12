package com.mrblue.codesquad.javaracingcar;

import java.util.Scanner;

/**
 * Created by kineo2k on 2018. 1. 12..
 * Email : kineo2k@gmail.com
 * <p>
 * 콘솔 입/출력을 담당
 */
public class ConsoleIO {
	private static final String BLANK = "";
	private static final String WHITE_SPACE = " ";

	private ConsoleIO() {}

	public static String readLine(final String promptMessage) {
		if (promptMessage != null) {
			final String message = new StringBuilder()
					.append(promptMessage)
					.append(WHITE_SPACE)
					.toString();

			print(message);
		}

		final Scanner scanner = new Scanner(System.in);

		return scanner.next();
	}

	public static void print(final String... messages) {
		System.out.print(joinMessages(messages));
	}

	public static void println(final String... messages) {
		System.out.println(joinMessages(messages));
	}

	// TODO: Varargs의 테스트 방법 확인해보자.
	private static String joinMessages(final String... messages) {
		if (messages == null)
			return BLANK;

		return String.join(BLANK, messages);
	}
}
