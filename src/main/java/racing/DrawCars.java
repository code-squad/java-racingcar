package racing;

import java.util.*;

public class DrawCars {

    public static Map<String, Integer> drawCarsWithName(List<Map<String, Integer>> arr) {
        for (int i = 0; i < arr.size(); i++) {
            for (String key : arr.get(i).keySet()) {
                System.out.println(generateLinesWithName(key, arr.get(i).get(key)));
            }
            System.out.println("");
            System.out.println("");
        }

        return arr.get(arr.size() - 1);
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
