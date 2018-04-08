package com.codesquad.carracing.ui;

import com.codesquad.carracing.domain.CarRacing;

public class InputView {

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
        if (number < CarRacing.NUMBER_OF_CARS_MIN) {
            throw new IllegalArgumentException("자동차는 " + Integer.toString(CarRacing.NUMBER_OF_CARS_MIN) + " 이상이 입력되어야 합니다.");
        }
    }

    public String[] inputCarNames() {
        writer.writeLine("경주할 자동차 이름을 입력하세요(이름은 쉼표(,)를 기준으로 구분).");
        final String names = reader.readLine();

        if (names == null || names.isEmpty()) {
            throw new IllegalArgumentException("하나 이상의 자동차 이름이 입력되어야 합니다.");
        }

        final String[] carNames = names.split(",");

        validateLessThanMinNumberOfCars(carNames.length);

        return carNames;
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
        if (number < CarRacing.NUMBER_OF_TRIES_MIN) {
            throw new IllegalArgumentException("시도횟수는 " + Integer.toString(CarRacing.NUMBER_OF_TRIES_MIN) + " 이상이 입력되어야 합니다.");
        }
    }
}
