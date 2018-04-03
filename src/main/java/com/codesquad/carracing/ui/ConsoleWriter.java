package com.codesquad.carracing.ui;

public class ConsoleWriter implements Writer {
    @Override
    public void writeLine(final String message) {
        System.out.println(message);
    }
}
