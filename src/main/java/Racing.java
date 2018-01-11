import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Random;
import java.util.Scanner;

public class Racing {
    private static final Logger logger = LoggerFactory.getLogger(Racing.class);
    //private static final Logger log = LoggerFactory.getLogger(Racing.class);
    // getLogger()에 전달하는 class이름이 중요. 이걸편안하게 하기위해 템플릿을 사용
    static private int time;
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

    public static void main (String args[]) {
        Racing racing = new Racing();
        Random rnd = new Random();
        Scanner scanner = new Scanner(System.in);

        //System.out.println("자동차 대수는 몇 대 인가요?");
        logger.info("자동차 대수는 몇 대 인가요? - using logger");
        //log.debug("자동차 대수는 몇 대 인가요? - using logger");도 가능하다. log.level("message");
        String car_number = scanner.nextLine();
        int number = Integer.parseInt(car_number);
        carPositions = new int[number];

        //System.out.println("시도할 회수는 몇 회 인가요?");
        logger.info("시도할 회수는 몇 회 인가요? - using logger");
        String count = scanner.nextLine();
        int counting = Integer.parseInt(count);

        //System.out.println("실행 결과");
        logger.info("실행 결과 - using logger");

        for (int i = 0; i < number; i++) {
            for (int j = 0; j < counting; j++) {
                if (rnd.nextInt(9) >= 4) {
                    carPositions[i] += 1;
                }
            }
            //System.out.println(i+"번째 자동차 " + carPositions[i]);
        }
        print_result(carPositions);
    }
}
