import java.util.List;

public class RacingView {
    public static void printStatus(int[] record){
        int numCar = record.length;
        for (int i =0; i<numCar; i++){
            System.out.println(convertToBar(record[i], 1));
        }
        System.out.println();
    }
    private static String convertToBar(int num, int offset){
        StringBuffer sb = new StringBuffer();
        for (int i=0; i<(num + offset); i++){
            sb.append("-");
        }
        return sb.toString();
    }
}

