package com.codesquad.carracing.view;

public class MockWriter implements Writer {

    private String willOut;

    @Override
    public void writeLine(final String out) {
        this.willOut = out;
    }

    public String getWillOut() {
        return this.willOut;
    }
}
