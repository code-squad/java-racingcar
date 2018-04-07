package com.codesquad.carracing.ui;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class InputViewTest {

    @Test
    public void 자동차_수_입력시_메시지() {
        final String messageForNumberOfCars = "자동차 대수는 몇 대 인가요?";
        final MockWriter writer = new MockWriter();
        final Reader reader = new FakeReader("1");
        final InputView view = new InputView(writer, reader);

        view.inputNumberOfCars(messageForNumberOfCars);

        final String willOut = writer.getWillOut();
        assertThat(willOut).isEqualTo(messageForNumberOfCars);
    }

    @Test
    public void 자동차_수량_입력기_호출() {
        final String inputNumberOfCars = "5";
        final Writer writer = new MockWriter();
        final FakeReader reader = new FakeReader(inputNumberOfCars);
        final InputView view = new InputView(writer, reader);

        view.inputNumberOfCars("");

        final boolean isRead = reader.isRead();
        assertThat(isRead).isTrue();
    }

    @Test
    public void 자동차_수량_입력() {
        final String inputNumberOfCars = "5";
        final Writer writer = new MockWriter();
        final FakeReader reader = new FakeReader(inputNumberOfCars);
        final InputView view = new InputView(writer, reader);

        final int numberOfCars = view.inputNumberOfCars("");

        final String readLine = reader.readLine();
        final int expected = Integer.parseInt(readLine);
        assertThat(numberOfCars).isEqualTo(expected);
    }

    @Test
    public void 자동차_수량_조회() {
        final String inputNumberOfCars = "4";
        final Writer writer = new MockWriter();
        final Reader reader = new FakeReader(inputNumberOfCars);
        final InputView view = new InputView(writer, reader);

        final int numberOfCars = view.inputNumberOfCars("");

        final int expected = Integer.parseInt(inputNumberOfCars);
        assertThat(numberOfCars).isEqualTo(expected);
    }

    @Test
    public void 자동차_다른수량_조회() {
        final String inputNumberOfCars = "3";
        final Writer writer = new MockWriter();
        final Reader reader = new FakeReader(inputNumberOfCars);
        final InputView view = new InputView(writer, reader);

        final int numberOfCars = view.inputNumberOfCars("");

        final int expected = Integer.parseInt(inputNumberOfCars);
        assertThat(numberOfCars).isEqualTo(expected);
    }

    @Test(expected = IllegalArgumentException.class)
    public void 자동차_수량이_숫자가_아님() {
        final String inputNumberOfCars = "abc";
        final Writer writer = new MockWriter();
        final Reader reader = new FakeReader(inputNumberOfCars);
        final InputView view = new InputView(writer, reader);

        view.inputNumberOfCars("");
    }

    @Test(expected = IllegalArgumentException.class)
    public void 자동차_수량이_1보다_작음() {
        final String inputNumberOfCars = "0";
        final Writer writer = new MockWriter();
        final Reader reader = new FakeReader(inputNumberOfCars);
        final InputView view = new InputView(writer, reader);

        view.inputNumberOfCars("");
    }

    @Test
    public void 시도_횟수_입력시_메시지() {
        final String messageForNumberOfTries = "시도 횟수는 몇 번 인가요?";
        final MockWriter writer = new MockWriter();
        final Reader reader = new FakeReader("1");
        final InputView view = new InputView(writer, reader);

        view.inputNumberOfTries(messageForNumberOfTries);

        final String willOut = writer.getWillOut();
        assertThat(willOut).isEqualTo(messageForNumberOfTries);
    }

    @Test
    public void 시도_횟수_입력기_호출() {
        final String inputNumberOfTries = "5";
        final Writer writer = new MockWriter();
        final FakeReader reader = new FakeReader(inputNumberOfTries);
        final InputView view = new InputView(writer, reader);

        view.inputNumberOfTries("");

        final boolean isRead = reader.isRead();
        assertThat(isRead).isTrue();
    }

    @Test
    public void 시도_횟수_입력() {
        final String inputNumberOfTries = "5";
        final Writer writer = new MockWriter();
        final FakeReader reader = new FakeReader(inputNumberOfTries);
        final InputView view = new InputView(writer, reader);

        final int numberOfTries = view.inputNumberOfTries("");

        final String readLine = reader.readLine();
        final int expected = Integer.parseInt(readLine);
        assertThat(numberOfTries).isEqualTo(expected);
    }

    @Test
    public void 시도_횟수_조회() {
        final String inputNumberOfTries = "4";
        final Writer writer = new MockWriter();
        final Reader reader = new FakeReader(inputNumberOfTries);
        final InputView view = new InputView(writer, reader);

        final int numberOfTries = view.inputNumberOfTries("");

        final int expected = Integer.parseInt(inputNumberOfTries);
        assertThat(numberOfTries).isEqualTo(expected);
    }

    @Test
    public void 다른_시도_횟수_조회() {
        final String inputNumberOfTries = "3";
        final Writer writer = new MockWriter();
        final Reader reader = new FakeReader(inputNumberOfTries);
        final InputView view = new InputView(writer, reader);

        final int numberOfTries = view.inputNumberOfTries("");

        final int expected = Integer.parseInt(inputNumberOfTries);
        assertThat(numberOfTries).isEqualTo(expected);
    }

    @Test(expected = IllegalArgumentException.class)
    public void 시도_횟수가_숫자가_아님() {
        final String inputNumberOfTries = "abc";
        final Writer writer = new MockWriter();
        final Reader reader = new FakeReader(inputNumberOfTries);
        final InputView view = new InputView(writer, reader);

        view.inputNumberOfTries("");
    }

    @Test(expected = IllegalArgumentException.class)
    public void 시도_횟수가_1보다_작음() {
        final String inputNumberOfTries = "0";
        final Writer writer = new MockWriter();
        final Reader reader = new FakeReader(inputNumberOfTries);
        final InputView view = new InputView(writer, reader);

        view.inputNumberOfTries("");
    }
}
