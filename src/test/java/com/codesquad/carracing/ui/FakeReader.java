package com.codesquad.carracing.ui;

public class FakeReader implements Reader {

    private String in;

    public FakeReader(String in) {
        this.in = in;
    }

    @Override
    public String readLine() {
        return in;
    }
}
