package com.codesquad.carracing.ui;

public class MockWriter implements Writer {

    private String willOutMessage;

    @Override
    public void writeLine(final String message) {
        this.willOutMessage = message;
    }

    public String getWillOutMessage() {
        return this.willOutMessage;
    }
}
