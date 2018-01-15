import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import java.util.Random;
import java.util.Scanner;

public class Racing {
    private static final Logger logger = LoggerFactory.getLogger(Racing.class);
    static private int count, carnumber;
    static private Car [] cars;
    static private String [] names;

    public static String repeat (int number) {
        String string = "";
        for (int i = 0; i < number; i++) {
            string += "-";
        }
        return string;
    }

    public static void printResult(Car [] carPositions) {
        for (int i = 0; i < carPositions.length; i++) {
            int empty = carPositions[i].getPosition();
            String result = repeat(empty);
            System.out.println(result);
        }
    }

    public static Car [] carinput(Scanner scanner){
        logger.info("경주할 자동차 이름을 입력하세요");
        String inputName = scanner.nextLine();
        String[] names = inputName.split(",");
        //Car car = new Car();
        // car 객체 생성. 생성자가 있으므로, name인자가 전달이 되어야됨.
        //int car_number = scanner.nextInt();
        cars = new Car[names.length];
        // cars의 길이선언.
        for (int i = 0; i < cars.length;i++) {
            cars[i] = new Car(names[i]);
            //checkMove(i,count);
        }
        return cars;
    }

    public static int count(Scanner scanner){
        logger.info("시도할 회수는 몇 회 인가요?");
        int count = scanner.nextInt();
        return count;
    }

    public static void loop(){
        Random rnd = new Random();
        for (int i = 0; i < cars.length;i++) {
            checkMove(i,count);
        }
        printResult(cars);
    }

    public static void checkMove (int j,int count) {
        Random rnd = new Random();
        for (int i = 0; i < count; i++) {
            cars[j].move(rnd.nextInt(10));
        }
    }


    public static void main (String args[]) {
        Racing racing = new Racing();
        Random rnd = new Random();
        Scanner scanner = new Scanner(System.in);
        carinput(scanner);
        count = count(scanner);
        logger.info("실행 결과");
        for(int i = 0; i < cars.length; i++){
            cars[i].move(rnd.nextInt(9));
        }
        loop();
    }
}

