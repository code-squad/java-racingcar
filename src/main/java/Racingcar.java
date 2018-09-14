import java.util.Scanner;

public class Racingcar {

    static final int Possible_Move_Num = 4;
    static final int Random_Num = 10;
    // commit test
    public static int carNum() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("자동차 몇 대를 호출하시겠습니까?");
        int cars = scanner.nextInt();
        return cars;
    }

    public static int carMove() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("자동차 얼마나 이동하시겠습니까?");
        int carMove = scanner.nextInt();
        return carMove;
    }

    public static void playGame(int car, int carMove) {
        int[] cars = new int[car];
        for (int i = 0; i < car; i++) {
            moveNum(carMove, cars, i);
            System.out.println("");
        }
    }

    public static void moveNum(int carMove, int[] cars, int i) {
        int ran;
        for (int j = 0; j < carMove; j++) {
            ran = (int) (Math.random() * Random_Num);
            cars[i] = ran;
            if (ran >= Possible_Move_Num) {
                System.out.print("-");
            }
        }
    }

    public static void main(String[] args) {
        int cars = carNum();
        int carMove = carMove();
        playGame(cars, carMove);
    }
}