package com.codesquad.carracingapp;

import java.util.Scanner;

public class ConsoleCarRacingApp {
    public static void main(final String[] args) {
        final Scanner scanner = new Scanner(System.in);

        System.out.println("자동차 대수는 몇 대 인가요?");
        final String numberOfCar = scanner.nextLine();

        System.out.println("시도할 회수는 몇 회 인가요?");
        final String numberOfMoving = scanner.nextLine();

        System.out.println(numberOfCar);
        System.out.println(numberOfMoving);
    }
}
