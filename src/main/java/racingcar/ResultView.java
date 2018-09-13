package racingcar;
import java.util.ArrayList;

public class ResultView {

    public static final String DASH = "-";
    public static final String COMMA = ", ";
    public static final int COMMA_LENGTH = 2;


    public static void printResult(ArrayList<Car> cars) {
        System.out.println("\n실행결과");
        for (Car car : cars) {
            System.out.print(car.getName() + " : ");
            printMove(car.getPosition());
        }
    }

    public static void printMove(int move) {
        for(int i = 0 ; i < move; i++) {
            System.out.print(DASH);
        }
        System.out.println();
    }

    public static void printWinner(ArrayList<Car> cars, int highest) {
        StringBuffer sb = new StringBuffer();
        for (Car car : cars) {
            sb.append(selectWinner(car.getPosition(), car.getName(), highest));
        }

        System.out.println(sb.deleteCharAt(sb.length() - COMMA_LENGTH) + "가 최종 우승했습니다.");
    }

    public static String selectWinner(int pos, String name, int highest) {
        if (pos == highest) {
            return name + COMMA;
        }
        return "";
    }
}
