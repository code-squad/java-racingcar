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
            String result = repeat(DASH, cars[i].extractPosition());
            System.out.println(cars[i].extractNameOfCar() + " : " + result);
        }
    }

    private static String repeat(String str, int times) {
        return new String(new char[times]).replace("\0", str);
    }
}