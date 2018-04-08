package com.codesquad.carracing.view;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class MockWriterTest {
    @Test
    public void 문자열_출력_목_기능() {
        final MockWriter writer = new MockWriter();
        final String expected = "안녕";

        writer.writeLine(expected);

        final String willOut = writer.getWillOut();
        assertThat(willOut).isEqualTo(expected);
    }

    @Test
    public void 다른문자열_출력_목_기능() {
        final MockWriter writer = new MockWriter();
        final String expected = "바이";

        writer.writeLine(expected);

        final String willOut = writer.getWillOut();
        assertThat(willOut).isEqualTo(expected);
    }
}
