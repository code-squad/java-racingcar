import java.util.Scanner;

public class InputView {
        static Scanner scanner = new Scanner(System.in);

    // 운전자의 이름들을 스캐너로 갖고옴.
    // playGame의 carNum으로 가서 차들의 숫자 계산
    public static String name() {
        System.out.println("Input Racers names. (when you split the names use comma',')");
        return scanner.nextLine();
    }

    // 차 이동 횟수 숫자
    public static int carMove() {
        System.out.println("Input Car Move Number!");
        int carMove = scanner.nextInt();
        return carMove;
    }
}
