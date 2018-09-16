package racing;

import java.util.*;

public class ResultView {
    public static void printFinalRacingResult(Car[] cars){
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < cars.length; i++)
            sb.append(cars[i].getName()).append(" : ").append(cars[i].getCarDistance() + "\n");

        System.out.println(sb.toString());
    }

    public static void printFinalWinners(List<String> winnerList) {
        StringBuilder sb = new StringBuilder();
        for(String winner : winnerList)
            sb.append(winner).append(",");

        System.out.println(String.join(",", winnerList) + "가 최종 우승했습니다.");
    }
}
