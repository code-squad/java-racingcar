package racing;

import java.util.List;

public class RacingResult {

    public static void printResult(List<Car> cars){
        cars.forEach(System.out::println);
        printSplitBetweenTrials();
    }

    public static void printBestDriver(List<String> cars){
        System.out.println(getResultMention(cars));
    }

    public static String getResultMention(List<String> cars) {
        String result = cars.get(0);

        for(int i = 1; i < cars.size(); i++){
            result = result + ", "+ cars.get(i);
        }

        return makeLastMention(result);
    }

    public static String makeLastMention(String result) {
        return result + " 최종 우승하였습니다.";
    }

    private static void printSplitBetweenTrials() {
        System.out.println();
        System.out.println();
    }

}
