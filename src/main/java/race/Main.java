package race;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("자동차 대수는 몇 대 인가요?");
        int cars = scanner.nextInt();

        System.out.println("시도할 회수는 몇 회 인가요?");
        int iteration = scanner.nextInt();
        
        RacingGame game = new RacingGame(
                getCarsNumberOf(cars), iteration, new DefaultMoveRule(), new LineDrawer());
        
        game.race();
    }
    
    private static List<Car> getCarsNumberOf(int number) {
        List<Car> cars = new ArrayList<>();

        for (int i = 0; i < number; i++) {
            cars.add(new Car());
        }

        return cars;
    }
}
