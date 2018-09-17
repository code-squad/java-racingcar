package com.zingoworks.racing;

import java.util.*;

public class ResultView {
    private static final String DASH = "-";

    public static void printResult() {
        System.out.println("실행 결과");
        for (int i = 0; i < Car.extractNumOfCars(); i++) {
            String result = repeat(DASH, Car.extractPosition(Car.cars[i]));
            System.out.println(Car.extractNameOfCar(Car.cars[i]) + " : " + result);
        }
        System.out.println("최종 우승자 : " + winner(findWinner()));
    }

    private static ArrayList<String> findWinner() {
        ArrayList<String> winners = new ArrayList<>();
        for (int i = 0; i < Car.extractNumOfCars(); i++) {
            addWinner(winners, i);
        }
        return winners;
    }

    private static void addWinner(ArrayList<String> winners, int i) {
        if (Car.extractPosition(Car.cars[i]) == Car.extractMaxposition()) {
            winners.add(Car.extractNameOfCar(Car.cars[i]));
        }
    }

    private static String winner(ArrayList<String> findWinner){
        String win = "";
        for(String winners : findWinner) {
            win += winners + " ";
        }
        return win;
    }

    private static String repeat(String str, int times) {
        return new String(new char[times]).replace("\0", str);
    }
}