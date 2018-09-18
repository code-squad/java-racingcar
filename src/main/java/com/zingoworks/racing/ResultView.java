package com.zingoworks.racing;

public class ResultView {
    private static final String DASH = "-";

    public static void printResult(RacingGame racingGame) {
        System.out.println("실행 결과");
        Car[] cars = racingGame.getCars();

        printStatus(cars);

        String winnerText = racingGame.generateWinnerText(racingGame.findWinners());
        System.out.println("최종 우승자 : " + winnerText);
    }

    private static void printStatus(Car[] cars) {
        for (int i = 0; i < cars.length; i++) {
            String result = repeat(DASH, Car.extractPosition(cars[i]));
            System.out.println(Car.extractNameOfCar(cars[i]) + " : " + result);
        }
    }

    private static String repeat(String str, int times) {
        return new String(new char[times]).replace("\0", str);
    }
}