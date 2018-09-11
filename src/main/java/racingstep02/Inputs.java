package racingstep02;

import java.util.Scanner;

public class Inputs {
    Scanner sc;

    Inputs() {
        sc = new Scanner(System.in);
    }

    public int getTime() {
        System.out.println("시도할 회수는 몇 회 인가요?");
        return sc.nextInt();
    }

    public int getCars() {
        System.out.println("자동차 대수는 몇 대 인가요?");
        return sc.nextInt();
    }

    public void close() {
        sc.close();
    }
}