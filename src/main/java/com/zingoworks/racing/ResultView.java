package com.zingoworks.racing;

public class ResultView {
    private static final String DASH = "-";

    ResultView (Car[] cars, String winner) {
        System.out.println("실행 결과");
        for (int i = 0; i < cars.length; i++) {
            String result = repeat(DASH, Car.extractPosition(cars[i]));
            System.out.println(Car.extractNameOfCar(cars[i]) + " : " + result);
        }
        System.out.println("최종 우승자 : " + winner);
    }

    private static String repeat(String str, int times) {
        return new String(new char[times]).replace("\0", str);
    }
}