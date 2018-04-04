package com.codesquad.carracing.ui;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class FakeReaderTest {
    @Test
    public void 문자열_입력_페이크() {
        final String expected = "30";
        final FakeReader reader = new FakeReader(expected);

        final String in = reader.readLine();

        assertThat(in).isEqualTo(expected);
    }

    @Test
    public void 다른문자열_입력_페이크() {
        final String expected = "ABC";
        final FakeReader reader = new FakeReader(expected);

        final String in = reader.readLine();

        assertThat(in).isEqualTo(expected);
    }

    @Test
    public void 문자열_입력_페이크_호출검증() {
        final FakeReader reader = new FakeReader("");

        final String in = reader.readLine();

        final boolean isRead = reader.isRead();
        assertThat(isRead).isTrue();
    }

    @Test
    public void 문자열_입력안함_페이크_호출검증() {
        FakeReader reader = new FakeReader("");

        boolean isRead = reader.isRead();
        assertThat(isRead).isFalse();

    }
}
