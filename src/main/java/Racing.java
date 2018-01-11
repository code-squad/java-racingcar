import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import java.util.Random;
import java.util.Scanner;

public class Racing {
    private static final Logger logger = LoggerFactory.getLogger(Racing.class);
    static private int count, carnumber;
    static private int [] carPositions;

    public static String repeat (int number) {
        String string = "";
        for (int i = 0; i < number; i++) {
            string += "-";
        }
        return string;
    }

    public static void print_result(int [] carPositions) {
        for (int i = 0; i < carPositions.length; i++) {
            int empty = carPositions[i];

            String result = repeat(empty);

            System.out.println(result);
        }
    }

    public static int [] Carinput(Scanner scanner){
        logger.info("자동차 대수는 몇 대 인가요? -- 메서드 분리");
        int car_number = scanner.nextInt();
        carPositions = new int[car_number];
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
            for (int j = 0; j < count; j++) {
                if (rnd.nextInt(9) >=4){
                    carPositions[i] += 1;
                }
            }
        }
        print_result(carPositions);
    }

    public static void main (String args[]) {
        Racing racing = new Racing();
        Random rnd = new Random();
        Scanner scanner = new Scanner(System.in);
        Carinput(scanner);
        count = Count(scanner);
        carnumber = carPositions.length;
        logger.info("실행 결과");
        loop(carnumber, count);

    }
}
