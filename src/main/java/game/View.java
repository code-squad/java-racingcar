package game;

import java.util.List;
import java.util.Scanner;

public class View {

    private Scanner scanner;

    public static View newInstance() {
        View view = new View();
        view.scanner = new Scanner(System.in);
        return view;
    }

    public int inputCarCount() {
        System.out.println("자동차 대수는 몇 대 인가요?");
        return scanner.nextInt();
    }

    public int inputTime() {
        System.out.println("시도할 회수는 몇 회 인가요?");
        return scanner.nextInt();
    }

    public void print(List<Car> cars) {
        System.out.println(draw(cars));
    }

    String draw(List<Car> cars) {
        StringBuilder result = new StringBuilder();
        for (Car car : cars) {
            for (int i = 0; i <= car.getPosition(); i++) {
                result.append("-");
            }
            result.append("\n");
        }

        return result.toString();
    }

    private View() {}
}
