package com.mrblue.codesquad.helpers;

import java.lang.reflect.Method;

/**
 * Created by kineo2k on 2018. 1. 8..
 * Email : kineo2k@gmail.com
 * <p>
 * Test 케이스 작성 시 사용할 헬퍼(유틸리티)를 관리합니다.
 * ...Util 같은 모델링은 마음에 들지 않지만, TDD 베이비 스텝이라서 어떻게 모델링 해야할지 아직 감을 못잡았습니다.
 * 향후 유지보수를 하면서 적당한 모델로 리팩토링 해야겠습니다.
 */
// TODO : 너무 바빠서 (이런 마인드 문제네요 ㅠ.ㅜ) TestUtil 클래스는 단위 테스트를 작성하지 못했습니다.
public class TestHelper {
	private static final String MSG_ARGUMENTS_FORMAT_ERROR = "args는 [{타입}, {값}, {타입}, {값}..]의 형태로 짝수 개수여야 합니다.";

	@SuppressWarnings("unchecked")
	public static <T> T invokeMethod(final Class<?> clazz, final String methodName,
									 final Class<T> returnType, final Object... args) {
		if (isOddArguments(args)) {
			throw new IllegalArgumentException(MSG_ARGUMENTS_FORMAT_ERROR);
		}

		try {
			final Object obj = clazz.newInstance();
			return invokeMethod(obj, methodName, returnType, args);
		} catch (final Exception ex) {
			throw new RuntimeException(ex);
		}
	}

	@SuppressWarnings("unchecked")
	public static <T> T invokeMethod(final Object obj, final String methodName,
									 final Class<T> returnType, final Object... args) {
		if (isOddArguments(args)) {
			throw new IllegalArgumentException(MSG_ARGUMENTS_FORMAT_ERROR);
		}

		final Class<?>[] parameterTypes  = new Class<?>[args.length / 2];
		final Object[]   parameterValues = new Object[args.length / 2];
		for (int i = 0; i < args.length; i += 2) {
			parameterTypes[i % 2] = (Class) args[i];
			parameterValues[i % 2] = args[i + 1];
		}

		try {
			//Arrays.asList(obj.getClass().getDeclaredMethods()).forEach(System.out::println);
			final Method method = obj.getClass().getDeclaredMethod(methodName, parameterTypes);
			method.setAccessible(true);
			return (T) method.invoke(obj, parameterValues);
		} catch (final Exception ex) {
			throw new RuntimeException(ex);
		}
	}

	private static boolean isOddArguments(final Object... args) {
		return args.length % 2 == 1;
	}
}
