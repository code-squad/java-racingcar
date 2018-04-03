package com.codesquad.carracing.ui;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class MockWriterTest {
    @Test
    public void 메시지_출력_목_기능() {
        final MockWriter writer = new MockWriter();
        final String someMessage = "안녕";

        writer.writeLine(someMessage);

        final String willOutMessage = writer.getWillOutMessage();
        assertThat(willOutMessage).isEqualTo(someMessage);
    }

    @Test
    public void 다른메시지_출력_목_기능() {
        final MockWriter writer = new MockWriter();
        final String otherMessage = "바이";

        writer.writeLine(otherMessage);

        final String willOutMessage = writer.getWillOutMessage();
        assertThat(willOutMessage).isEqualTo(otherMessage);
    }
}
