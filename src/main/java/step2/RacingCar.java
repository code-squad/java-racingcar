package step2;

import java.util.Scanner;

public class RacingCar {
    static Scanner s = new Scanner(System.in);

    public static void main(String[] args) {
        Movement mm = new Movement();

        mm.carNumber();
        mm.moveNumber();
        mm.out();
    }
}