package racingcar;
import java.util.ArrayList;

public class ResultView {

    public static final String DASH = "-";
    int max = 0;

    public void print(ArrayList<Car> cars) {
        System.out.println("\n실행결과");
        for (Car car : cars) {
            System.out.print(car.getName() + " : ");
            printMove(car.getPosition());
        }

        for (Car car : cars) {
            printWinner(car.getName(), car.getPosition());
        }
        System.out.println("가 최종 우승했습니다.");

    }

    private void printMove(int move) {
        for(int i = 0 ; i < move; i++) {
            System.out.print(DASH);
        }
        System.out.println();

        if(move >= max) {
            max = move;
        }
    }

    private void printWinner(String name, int pos) {
        if(pos == max) {
            System.out.print(name + ",");
        }
    }
}
