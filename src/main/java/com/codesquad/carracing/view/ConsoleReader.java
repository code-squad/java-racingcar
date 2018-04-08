package com.codesquad.carracing.view;

import java.util.Scanner;

public class ConsoleReader implements Reader {
    @Override
    public String readLine() {
        final Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }
}
