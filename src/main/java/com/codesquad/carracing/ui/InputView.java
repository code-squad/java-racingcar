package com.codesquad.carracing.ui;

public class InputView {
    private static final int NUMBER_OF_CARS_MIN = 1;
    private static final int NUMBER_OF_TRIES_MIN = 1;
    private final Writer writer;
    private final Reader reader;

    public InputView(final Writer writer, final Reader reader) {
        this.writer = writer;
        this.reader = reader;
    }

    public int inputNumberOfCars(final String messageForNumberOfCars) {
        writer.writeLine(messageForNumberOfCars);
        final int numberOfCars = parseNumber(reader.readLine());

        validateLessThanMinNumberOfCars(numberOfCars);

        return numberOfCars;
    }

    private void validateLessThanMinNumberOfCars(final int number) {
        if (number < InputView.NUMBER_OF_CARS_MIN) {
            throw new IllegalArgumentException("자동차는 " + Integer.toString(InputView.NUMBER_OF_CARS_MIN) + " 이상이 입력되어야 합니다.");
        }
    }

    public int inputNumberOfTries(final String messageForNumberOfTries) {
        writer.writeLine(messageForNumberOfTries);
        final int numberOfTries = parseNumber(reader.readLine());

        validateLessThanMinNumberOfTries(numberOfTries);

        return numberOfTries;
    }

    private int parseNumber(final String in) {
        try {
            return Integer.parseInt(in);
        } catch (final NumberFormatException e) {
            throw new IllegalArgumentException(
                    "입력한 수량 값 \"" + in + "\"이 숫자가 아닙니다.", e);
        }
    }

    private void validateLessThanMinNumberOfTries(final int number) {
        if (number < InputView.NUMBER_OF_TRIES_MIN) {
            throw new IllegalArgumentException("시도횟수는 " + Integer.toString(InputView.NUMBER_OF_TRIES_MIN) + " 이상이 입력되어야 합니다.");
        }
    }
}
