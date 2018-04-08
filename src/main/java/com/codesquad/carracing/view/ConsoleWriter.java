package com.codesquad.carracing.view;

public class ConsoleWriter implements Writer {

    @Override
    public void writeLine(final String out) {
        System.out.println(out);
    }
}
