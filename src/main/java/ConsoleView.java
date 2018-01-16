import java.util.ArrayList;
import java.util.Scanner;

public class ConsoleView {

    private static Scanner scanner = new Scanner(System.in);

    public int askCarCount() {
        System.out.println("자동차 대수는 몇 대 인가요?");
        return scanner.nextInt();
    }

    public int askRacingCount() {
        System.out.println("시도할 회수는 몇 회 인가요?");
        return scanner.nextInt();
    }

    public void printCarPositions(ArrayList<Car> cars) {
        for(Car car : cars) {
            System.out.println(getPositionString(car));
        }
    }

    private String getPositionString(Car car) {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < car.getPosition(); i++)
            builder.append("-");

        return builder.toString();
    }
}

