package com.zingoworks.racing;

import java.util.Scanner;

public class RacingGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Car.setCars();
        Process.doRun(Car.cars, InputView.getTrials(sc));
        ResultView.printResult();
    }
}