package com.codesquad.carracing.ui;

public class InputView {
    private static final int NUMBER_OF_CARS_MIN = 1;
    private static final int NUMBER_OF_TRIES_MIN = 1;
    private final Writer writer;
    private final Reader reader;
    private int numberOfCars;
    private int numberOfTries;

    public InputView(final Writer writer, final Reader reader) {
        this.writer = writer;
        this.reader = reader;
    }

    public void inputNumberOfCars(final String messageForNumberOfCars) {
        writer.writeLine(messageForNumberOfCars);
        final int numberOfCars = parseNumber(reader.readLine());

        validateLessThanMinNumberOfCars(numberOfCars);

        this.numberOfCars = numberOfCars;
    }

    public int getNumberOfCars() {
        return this.numberOfCars;
    }

    private void validateLessThanMinNumberOfCars(final int number) {
        if (number < InputView.NUMBER_OF_CARS_MIN) {
            throw new IllegalArgumentException("자동차는 " + Integer.toString(NUMBER_OF_CARS_MIN) + " 이상이 입력되어야 합니다.");
        }
    }

    public void inputNumberOfTries(final String messageForNumberOfTries) {
        writer.writeLine(messageForNumberOfTries);
        final int numberOfTries = parseNumber(reader.readLine());

        validateLessThanMinNumberOfTries(numberOfTries);

        this.numberOfTries = numberOfTries;
    }

    public int getNumberOfTries() {
        return this.numberOfTries;
    }

    private int parseNumber(final String in) {
        try {
            return Integer.parseInt(in);
        } catch (final NumberFormatException e) {
            throw new IllegalArgumentException(
                    "입력한 수량 값 \"" + in + "\"이 숫자가 아닙니다.", e);
        }
    }

    private void validateLessThanMinNumberOfTries(int number) {
        if (number < InputView.NUMBER_OF_TRIES_MIN) {
            throw new IllegalArgumentException("시도횟수는 " + Integer.toString(NUMBER_OF_TRIES_MIN) + " 이상이 입력되어야 합니다.");
        }
    }
}
