import java.util.Scanner;

public class RacingInput {
    public static int readNumCar(){
        System.out.print("몇 대가 출전하나요?:");
        Scanner scanner = new Scanner(System.in);
        int value = scanner.nextInt();
        return value;
    }

    public static int readNumCircuit(){
        System.out.print("몇 바퀴를 도나요?:");
        Scanner scanner = new Scanner(System.in);
        int value = scanner.nextInt();
        return value;
    }


}
