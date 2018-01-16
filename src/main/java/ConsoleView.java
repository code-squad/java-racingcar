import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ConsoleView {

    private static Scanner scanner = new Scanner(System.in);

    public String[] askCarCount() {
        System.out.println("경주할 자동차 이름을 입력하세요(이름은 쉼표(,)를 기준으로 구분).");
        return scanner.nextLine().split(",");
    }

    public int askRacingCount() {
        System.out.println("시도할 회수는 몇 회 인가요?");
        return scanner.nextInt();
    }

    public void printCarPositions(List<Car> cars, String[] winners) {
        StringBuilder builder;
        for (Car car : cars) {
            builder = new StringBuilder();
            builder.append(car.getName())
                    .append(" : ")
                    .append(getPositionString(car));
            System.out.println(builder.toString());
        }
        System.out.println(String.join(", ", winners) + " 최종 우승했습니다.");

    }

    private String getPositionString(Car car) {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < car.getPosition(); i++)
            builder.append("-");

        return builder.toString();
    }
}

