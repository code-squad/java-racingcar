package com.codesquad.carracing.ui;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class InputViewTest {

    @Test
    public void 자동차_수_입력시_메시지() {
        final String expected = "자동차 대수는 몇 대 인가요?";
        final MockWriter writer = new MockWriter();
        Reader reader = new FakeReader("");
        final InputView view = new InputView(writer, reader);

        view.inputNumberOfCars(expected);

        final String willOut = writer.getWillOut();
        assertThat(willOut).isEqualTo(expected);
    }

    @Test
    public void 자동차_수량_입력() {
        String expected = "5";
        Writer writer = new MockWriter();
        FakeReader reader = new FakeReader(expected);
        InputView view = new InputView(writer, reader);

        view.inputNumberOfCars("");

        String numberOfCars = reader.readLine();
        assertThat(numberOfCars).isEqualTo(expected);
    }

    @Test
    public void 자동차_수량_조회() {
        String expected = "5";
        Writer writer = new MockWriter();
        Reader reader = new FakeReader(expected);
        InputView view = new InputView(writer, reader);
        view.inputNumberOfCars("");

        String numberOfCars = view.getNumberOfCars();

        assertThat(numberOfCars).isEqualTo(expected);
    }
}
