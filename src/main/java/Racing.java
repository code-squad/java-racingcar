import org.apache.commons.lang3.ArrayUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import java.util.Random;
import java.util.Scanner;
import java.util.ArrayList;

public class Racing {
    private static final Logger logger = LoggerFactory.getLogger(Racing.class);
    static private int count;
    static private Car[] cars;
    static private String[] names;

    public static String[] nameInput(Scanner scanner){
        logger.info("경주할 자동차 이름을 입력하세요");
        String inputName = scanner.nextLine();
        String[] names = inputName.split(",");
        return names;
    }

    public static Car[] carinput(String[] names){
        cars = new Car[names.length];
        for (int i = 0; i < cars.length;i++) {
            cars[i] = new Car(names[i]);
        }
        return cars;
    }

    public static int count(Scanner scanner){
        logger.info("시도할 회수는 몇 회 인가요?");
        int count = scanner.nextInt();
        return count;
    }

    public static void printResult(Car[] carPositions) {
        for (int i = 0; i < carPositions.length; i++) {
            int empty = carPositions[i].getPosition();
            String result = repeat(empty);
            System.out.print(names[i] + " : ");
            System.out.println(result);
        }
    }

    public static String repeat (int number) {
        String string = "";
        for (int i = 0; i < number; i++) {
            string += "-";
        }
        return string;
    }

    public static void checkMove (int j,int count) {
        Random rnd = new Random();
        for (int i = 0; i < count; i++) {
            cars[j].move(rnd.nextInt(10));
        }
    }

    public static void loop(){
        for (int i = 0; i < cars.length;i++) {
            checkMove(i , count);
        }
        printResult(cars);
    }

    public static ArrayList<Integer> getPositionArray(){
        int[] arraysPosition;
        arraysPosition = new int[cars.length];
        for (int i = 0; i < cars.length; i++){
            arraysPosition[i] = cars[i].getPosition();
        }

        int max = arraysPosition[0];
        for (int i = 0; i < cars.length; i++){
            if (arraysPosition[i] > max){
                max = arraysPosition[i];
            }
        }
        ArrayList<Integer> maxIndex = new ArrayList<Integer>();
        for (int i = 0; i < cars.length; i++){
            if (max == arraysPosition[i]){
                maxIndex.add(i);
            }
        }
        return maxIndex;
    }

    public static void findChampion(ArrayList<Integer> maxIndex){
        String result = "";
        for (int i = 0; i < maxIndex.size(); i++){
            result += names[i] + ",";
        }
        logger.info("{}가 최종 우승했습니다.", result.substring(0, result.length()-1));
    }

    public static void main (String args[]) {
        Racing racing = new Racing();
        Random rnd = new Random();
        Scanner scanner = new Scanner(System.in);
        names = nameInput(scanner);
        // 변수에 직접 저장을 해야 리턴값을 사용할 수 있다.
        carinput(names);
        count = count(scanner);
        logger.info("실행 결과");
        loop();
        getPositionArray();
        ArrayList<Integer> maxIndex = getPositionArray();
        findChampion(maxIndex);
    }
}

