package racingcar;

import java.util.*;

public class ResultView {

    private static final String DASH = "-";

    static Process p = new Process();

    ResultView(){
        printResult();
    }

    private void printResult() {
        System.out.println("실행 결과");
        for (int i = 0; i < p.cars.length; i++) {
            String result = repeat(DASH, p.carPositions[i]);
            System.out.println(p.cars[i] + " : " + result);
        }
        System.out.println("최종 우승자 : " + winner(findWinner()));
    }

    private int getMax() {
        int max = 0;
        for (int i = 0; i < p.cars.length; i++) {
            max = setMax(p.carPositions[i], max);
        }
        return max;
    }

    private int setMax(int carPosition, int max) {
        if (max < carPosition) {
            max = carPosition;
        }
        return max;
    }

    private ArrayList<String> findWinner() {
        ArrayList<String> winners = new ArrayList<String>();
        for (int i = 0; i < p.cars.length; i++) {
            addWinners(winners, i);
        }
        return winners;
    }

    private void addWinners(ArrayList<String> winners, int i) {
        if (p.carPositions[i] == getMax()) {
            winners.add(p.cars[i]);
        }
    }

    private String winner(ArrayList<String> findWinner){
        String win = "";
        for(String winners : findWinner) {
            win += winners + " ";
        }
        return win;
    }

    private String repeat(String str, int times) {
        return new String(new char[times]).replace("\0", str);
    }
}