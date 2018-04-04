package com.codesquad.carracing.ui;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class FakeReaderTest {
    @Test
    public void 문자열_입력() {
        String expected = "30";
        FakeReader reader = new FakeReader(expected);

        String in = reader.readLine();

        assertThat(in).isEqualTo(expected);
    }

    @Test
    public void 다른문자열_입력() {
        String expected = "ABC";
        FakeReader reader = new FakeReader(expected);

        String in = reader.readLine();

        assertThat(in).isEqualTo(expected);
    }
}
