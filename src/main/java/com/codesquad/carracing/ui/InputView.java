package com.codesquad.carracing.ui;

public class InputView {

    private final Writer writer;

    public InputView(final Writer writer) {
        this.writer = writer;
    }

    public void inputNumberOfCars(final String message) {
        writer.writeLine(message);
    }
}
