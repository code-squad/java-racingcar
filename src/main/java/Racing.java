import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import java.util.Random;
import java.util.Scanner;

public class Racing {
    private static final Logger logger = LoggerFactory.getLogger(Racing.class);
    static private int count, carnumber;
    static private Car [] carPositions;

    public static String repeat (int number) {
        String string = "";
        for (int i = 0; i < number; i++) {
            string += "-";
        }
        return string;
    }

    public static void print_result(Car [] carPositions) {
        for (int i = 0; i < carPositions.length; i++) {
            int empty = carPositions[i].getPosition();
            String result = repeat(empty);
            System.out.println(result);
        }
    }

    public static Car [] Carinput(Scanner scanner){
        logger.info("자동차 대수는 몇 대 인가요? -- 메서드 분리");
        Car car = new Car();
        int car_number = scanner.nextInt();
        carPositions = new Car[car_number];
        // carPositions에는 배열의 주소값이 들어가있다.
        return carPositions;
    }

    public static int Count(Scanner scanner){
        logger.info("시도할 회수는 몇 회 인가요?");
        int count = scanner.nextInt();
        return count;
    }

    public static void loop(int carnumber,int count){
        Random rnd = new Random();
        for (int i = 0; i < carnumber;i++) {
            carPositions[i] = new Car();
            // 중요.
            for (int j = 0; j < count; j++) {
                carPositions[i].move(rnd.nextInt(10));
            }
            logger.info((i+1)+"번째 자동차의 위치는 " + "current position is {}", carPositions[i].getPosition());
        }
        print_result(carPositions);
    }

    public static void main (String args[]) {
        Racing racing = new Racing();
        Random rnd = new Random();
        Car car = new Car();
        car.move(rnd.nextInt(9));
        Scanner scanner = new Scanner(System.in);
        Carinput(scanner);
        count = Count(scanner);
        carnumber = carPositions.length;
        logger.info("실행 결과");
        loop(carnumber, count);

    }
}

