package com.codesquad.carracing.view;

public class InputView {

    private final Writer writer;
    private final Reader reader;

    public InputView(final Writer writer, final Reader reader) {
        this.writer = writer;
        this.reader = reader;
    }

    public int inputNumberOfCars(final String messageForNumberOfCars) {
        writer.writeLine(messageForNumberOfCars);
        return parseNumber(reader.readLine());
    }

    public String inputCarNames() {
        writer.writeLine("경주할 자동차 이름을 입력하세요(이름은 쉼표(,)를 기준으로 구분).");
        return reader.readLine();
    }

    public int inputNumberOfTries(final String messageForNumberOfTries) {
        writer.writeLine(messageForNumberOfTries);
        return parseNumber(reader.readLine());
    }

    private int parseNumber(final String in) {
        try {
            return Integer.parseInt(in);
        } catch (final NumberFormatException e) {
            throw new IllegalArgumentException(
                    "입력한 수량 값 \"" + in + "\"이 숫자가 아닙니다.", e);
        }
    }
}
