package racing.view;

import racing.domain.Car;

import java.util.List;

public class RacingResult {

    public static void printResult(List<Car> cars){
        cars.forEach( car -> {
            System.out.println(RacingResult.printCarResult(car));
        });
        printSplitBetweenTrials();
    }

    public static String printCarResult(Car car) {
        StringBuilder builder = new StringBuilder(car.getName()+":");
        for(int i = 0; i < car.getDistance(); i++){
            builder.append("-");
        }

        return builder.toString();
    }

    public static String printBestDriver(List<String> cars){
        return getResultMention(cars);
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
