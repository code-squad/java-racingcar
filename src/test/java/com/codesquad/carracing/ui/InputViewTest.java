package com.codesquad.carracing.ui;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class InputViewTest {

    @Test
    public void 자동차_수_입력시_메시지() {
        final MockWriter writer = new MockWriter();
        final InputView view = new InputView(writer);
        final String outputMessage = "자동차 대수는 몇 대 인가요?";

        view.inputNumberOfCars(outputMessage);

        final String willOutMessage = writer.getWillOutMessage();
        assertThat(willOutMessage).isEqualTo(outputMessage);
    }


}
