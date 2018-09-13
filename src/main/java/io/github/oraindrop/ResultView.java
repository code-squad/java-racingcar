package io.github.oraindrop;

import java.util.List;

public class ResultView {

    public static void printResultMessage(List<Car> cars){
        StringBuilder sb = new StringBuilder();
        sb.append("실행 결과\n");
        for(Car car : cars){
            sb.append(car.getName() + " : " + makeDashView(car.getScore()) + "\n");
        }
        System.out.println(sb.toString());
    }

    public static String makeDashView(int position){
        String resultPosition = "";
        for (int i = 0; i < position; i++) {
            resultPosition += "-";
        }
        return resultPosition;
    }

    public static void printWinnerMessage(List<String> winners){
        StringBuilder sb = new StringBuilder();
        String winnerNames = String.join(", ", winners);
        sb.append(winnerNames + "가 최종 우승 했습니다.");
        System.out.println(sb.toString());
    }



}
