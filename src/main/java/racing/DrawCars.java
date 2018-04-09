package racing;

import java.util.*;

public class DrawCars {

    public static List<Car> drawCarsWithName(List<Car> result, int names) {

        for (int i = 0; i< result.size(); i++) {
            System.out.println(generateLinesWithName(result.get(i).getName(), result.get(i).getPosition()));

            if (i % names == (names - 1)) {
                System.out.println("");
                System.out.println("");
            }
        }

        return result;
    }

    private static String generateLinesWithName(String name, int num) {
        StringBuilder builder = new StringBuilder();
        builder.append(name + " : ");
        for (int i = 0; i < num; i++)
            builder.append("-");

        return builder.toString();
    }

}
