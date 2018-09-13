package step2;
import java.util.Random;
import java.util.Scanner;

public class Movement {
    static Scanner s = new Scanner(System.in);

    RacingCar Rc = new RacingCar();
    int car = Rc.carNumber();
    int[] carMove = Rc.moveNumber();

    public void out() {
        System.out.println("***********");
        for (int i = 0; i < car; i++) {
            run1();
            System.out.println();
        }
    }

    public int[] moveRandom() {
        Random r = new Random();
        for (int i = 0; i < carMove.length; i++) {
            carMove[i] = r.nextInt(9);
        }
        return carMove;
    }

    public void run1() {
        for (int i = 0; i < carMove.length; i++) {
            repetition(carMove[i]);
            moveRandom();
        }
    }

    private void repetition(int i) {
        if (i >= 4) {
            System.out.print("-");
        }
    }
}
