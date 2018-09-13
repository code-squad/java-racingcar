import java.util.Random;
import java.util.Scanner;

public class Racingcar {

    //차 갯수 생성
    public static int carNum() {
        System.out.println("자동차 몇대를 가져오시겠습니까?");
        Scanner scan1 = new Scanner(System.in);
        int carNum = scan1.nextInt();
        System.out.println(carNum);
        return carNum;
    }

    //차 이동 숫자
    public static int moveNum() {
        System.out.println("얼마나 이동 하시겠습니까?");
        Scanner scan2 = new Scanner(System.in);
        int moveNum = scan2.nextInt();
        return moveNum;
    }

    // 게임 실행 및 출력
    public static void playGame(int carN, int move) {
        Random random = new Random();
        int randomNum = 0;
        int[] cars = new int[carN];
        System.out.println("실행결과");
        for (int i = 0; i < carN; i++) {
            cars[i] = randomNum;
            for (int j = 0; j < move; j++) {
            randomNum = random.nextInt(10);
                if (randomNum >= 4) {
                    System.out.print("-");
                } else {
                    System.out.print("");
                }
            }
            System.out.println("");
        }
    }

    public static void main(String[] args) {
        int carN = carNum();
        int moveN = moveNum();
        playGame(carN, moveN);
    }
}