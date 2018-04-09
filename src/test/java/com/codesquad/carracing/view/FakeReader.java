package com.codesquad.carracing.view;

public class FakeReader implements Reader {

    private final String in;
    private boolean isRead;

    public FakeReader(final String in) {
        isRead = false;
        this.in = in;
    }

    @Override
    public String readLine() {
        this.isRead = true;
        return in;
    }

    public boolean isRead() {
        return isRead;
    }
}
