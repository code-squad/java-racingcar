package racing;

import java.util.*;

import static java.util.stream.Collectors.joining;

public class DrawCars {

    public static void drawCars(List<List<Integer>> arr) {
        for (int i = 0; i < arr.size(); i++) {
            for (int j = 0; j < arr.get(i).size(); j++) {
                System.out.println(generateLines(arr.get(i).get(j)));
            }
            System.out.println("");
            System.out.println("");
        }
    }

    public static HashMap<String, Integer> drawCarsWithName(List<HashMap<String, Integer>> arr) {
        for (int i = 0; i < arr.size(); i++) {
            for (String key : arr.get(i).keySet()) {
                System.out.println(generateLinesWithName(key, arr.get(i).get(key)));
            }
            System.out.println("");
            System.out.println("");
        }

        return arr.get(arr.size() - 1);
    }

    public static void showWinners(HashMap<String, Integer> result) {
        int maxValue = Collections.max(result.values());

        final String resultName = result.entrySet()
                .stream()
                .filter(num -> num.getValue() >= maxValue)
                .map(Map.Entry::getKey)
                .collect(joining(", "));


        System.out.println(resultName + "가 최종 우승했습니다.");

    }

    private static String generateLines(int num) {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < num; i++) {
            builder.append("-");
        }

        return builder.toString();
    }

    private static String generateLinesWithName(String name, int num) {
        StringBuilder builder = new StringBuilder();
        builder.append(name + " : ");
        for (int i = 0; i < num; i++) {
            builder.append("-");
        }

        return builder.toString();
    }

}
