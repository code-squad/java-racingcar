package racing;

import java.util.List;

public class RacingResult {

    public static void printResult(List<Car> cars){
        cars.forEach(System.out::println);

        printSplitBetweenTrials();
    }

    private static void printSplitBetweenTrials() {
        System.out.println();
        System.out.println();
    }

}
