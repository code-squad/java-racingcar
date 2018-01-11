package game.racingGame;

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
}
