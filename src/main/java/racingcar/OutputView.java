package racingcar;

public class OutputView {

    public static void drawResult(String result){
        System.out.println(result);
    }

    public static void addGameResult(int[] currentPostions , StringBuilder result) {
        for(int currentPosition : currentPostions) {
            postionToString(currentPosition,result);
        }
        result.append("\n");
    }

    public static void postionToString(int position , StringBuilder result){
        for(int i =0; i < position; i++) {
            result.append("-");
        }
        result.append("\n");
    }
}
