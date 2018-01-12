package game.racingGame;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class View {
    public static void printResult(RacingGame racingGame) {
        Map<String, Integer> result = racingGame.getResult();

        for (String key: result.keySet()){
            System.out.print(key + " ");
            printPosition(result.get(key));
        }

        for (String name: racingGame.getWinnersName()){
            System.out.print(name + " ");
        }
    }

    private static void printPosition(Integer position){
        for (int i = 0; i < position; i++) {
            System.out.print("-");
        }
        System.out.println();
    }

    public static List<String> getVisibleResult(Map<String, Integer> result){
        List<String> visibleResult = new ArrayList();

        for (String key: result.keySet()){
            visibleResult.add(key + getSpace(result.get(key)) );
        }
        return visibleResult;
    }

    private static String getSpace(Integer integer) {
        StringBuilder space = new StringBuilder(" : ");
        String blank = " . ";

        for (int i = 0; i < integer ; i++) {
            space.append(blank);
        }

        return space.toString();
    }
}
