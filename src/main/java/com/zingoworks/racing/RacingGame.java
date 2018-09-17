package com.zingoworks.racing;

import java.util.*;

public class RacingGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] carName = InputView.setCarsName(sc);
        int trials = InputView.getTrials(sc);
        Process p = new Process(carName, trials);
        Car[] cars = p.setCars();
        ArrayList<String> winners = p.findWinner();
        ResultView r = new ResultView(cars, p.winner(winners));
    }
}