package race;

import java.util.*;

public class ResultView {
    private static final String DASH = "-";

    public static void namePrint(String name) {
        System.out.print(name + " : ");
    }

    public static void victory(String name){
        String answer = name.substring(0,name.length()-1);
        answer += "가 우승했습니다.";
        System.out.println(answer);
    }

    public static void dashPrint (int carPosition){
        for (int k = 0; k < carPosition; k++) {
            System.out.print(DASH);
        }
        System.out.println();
    }

}

