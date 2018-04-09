package racing;

import java.util.*;

public class DrawCars {

    public static List<Car> drawCarsWithName(List<List<Car>> result) {

        for (List<Car> carList : result) {
            for (Car car : carList)
                System.out.println(generateLinesWithName(car.getName(), car.getPosition()));

            System.out.println("");
            System.out.println("");
        }

        return result.get(result.size() - 1);
    }

    private static String generateLinesWithName(String name, int num) {
        StringBuilder builder = new StringBuilder();
        builder.append(name + " : ");
        for (int i = 0; i < num; i++)
            builder.append("-");

        return builder.toString();
    }

}
