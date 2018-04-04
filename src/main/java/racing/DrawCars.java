package racing;

import java.util.List;

public class DrawCars {

    public static void drawCars(List<List<Integer>> arr) {
        for (int i=0; i<arr.size(); i++) {
            for (int j=0; j<arr.get(i).size(); j++) {
                System.out.println(generateLines(arr.get(i).get(j)));
            }
            System.out.println("");
            System.out.println("");
        }
    }

    private static String generateLines(int num) {
        StringBuilder builder = new StringBuilder();
        for (int i=0; i<num; i++) {
            builder.append("-");
        }

        return builder.toString();
    }

}
