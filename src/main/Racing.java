import java.util.Random;
import java.util.Scanner;

public class Racing {
    private int time;
    //    static private int [] carPositions = new int[number];
    static private int [] carPositions;

    public String repeat (int number) {
        String string = "";
        for (int i = 0; i < number; i++) {
            string += "-";
        }
        return string;
    }

    public void print(int [] carPositions) {
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

        System.out.println("자동차 대수는 몇 대 인가요?");
        String car_number = scanner.nextLine();
        int number = Integer.parseInt(car_number);
        carPositions = new int[number];
        // 배열을 초기화한다.

        System.out.println("시도할 회수는 몇 회 인가요?");
        String count = scanner.nextLine();
        int counting = Integer.parseInt(count);

        System.out.println("실행 결과");
        for (int i = 0; i < number; i++) {
            for (int j = 0; j < counting; j++) {
                if (rnd.nextInt(9) >= 4) {
                    carPositions[i] += 1;
                }
            }
            System.out.println(carPositions[i]);
        }
    }
}
