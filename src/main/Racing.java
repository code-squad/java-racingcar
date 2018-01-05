import java.util.Random;
import java.util.Scanner;

public class Racing {
    private int time;
//    static private int [] carPositions = new int[number];
    static private int [] carPositions;

    public static void main (String args[]) {
        Racing racing = new Racing();

        Random rnd = new Random();
        Scanner scanner = new Scanner(System.in);

        System.out.println("자동차 대수는 몇 대 인가요?");
        String car_number = scanner.nextLine();
        int number = Integer.parseInt(car_number);
        carPositions = new int[number];
        // 배열을 초기화한다.

        System.out.println("시도할 회수는 몇 회 인가요?");
        String count = scanner.nextLine();
        int counting = Integer.parseInt(count);

        //System.out.println(racing.carPositions);
        // address of array

        //System.out.println(rnd.nextInt(10));

        System.out.println("실행 결과");
        for (int data:carPositions) {
            data = rnd.nextInt(10);
            if (data >= 4) {
                System.out.println(data);
            } else {
                System.out.println("Not moving");
            }

        }

    }
}