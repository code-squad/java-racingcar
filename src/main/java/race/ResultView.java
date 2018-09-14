package race;

import java.util.*;

public class ResultView {

    private static final String DASH = "-";

    public static void namePrint(String name) {
        System.out.print(name + " : ");
    }

    public static void dashPrint(int carPositions) {
        for (int k = 0; k < carPositions; k++) {
            System.out.print(DASH);
        }
        System.out.println();
    }

    public static void whoVictory(Car[] car, int max) {
        String answer = "";
        for (int i = 0; i < car.length; i++) {
            answer += (car[i].getPosition() == max) ? (car[i].getName() + ",") : "";
        }

        answer = answer.substring(0,answer.length()-1);
        answer += "가 우승했습니다.";
        System.out.println(answer);
    }

}
