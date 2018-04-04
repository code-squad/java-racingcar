package com.codesquad.carracing.ui;

public class InputView {

    private final Writer writer;
    private final Reader reader;
    private String numberOfCars;

    public InputView(final Writer writer, final Reader reader) {
        this.writer = writer;
        this.reader = reader;
    }

    public void inputNumberOfCars(final String message) {
        writer.writeLine(message);
        this.numberOfCars = reader.readLine();
    }

    public String getNumberOfCars() {
        return this.numberOfCars;
    }
}
