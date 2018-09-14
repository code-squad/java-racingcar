package io.github.oraindrop;

import java.util.List;

public class ResultView {
    private static final String NEW_LINE = "\n";
    private static final String COLON = ":";
    private static final String DASH = "-";
    private static final String COMMA = ",";
    private static final String SPACE = " ";

    public static void printResultMessage(List<Car> cars){
        StringBuilder sb = new StringBuilder();
        sb.append("실행 결과" + NEW_LINE);
        for(Car car : cars){
            sb.append(car.getName() + SPACE + COLON + SPACE + makeDashView(car.getScore()) + NEW_LINE);
        }
        System.out.println(sb.toString());
    }

    public static String makeDashView(int position){
        String resultPosition = "";
        for (int i = 0; i < position; i++) {
            resultPosition += DASH;
        }
        return resultPosition;
    }

    public static void printWinnerMessage(List<String> winners){
        StringBuilder sb = new StringBuilder();
        String winnerNames = String.join(COMMA + SPACE, winners);
        sb.append(winnerNames + "가 최종 우승 했습니다.");
        System.out.println(sb.toString());
    }



}
