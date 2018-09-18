package com.zingoworks.racing;

import java.util.Scanner;

public class InputView {
    static Scanner sc = new Scanner(System.in);

    public static String[] getCarsName() {
        System.out.println("경주 할 자동차 이름을 입력하세요(이름은 쉼표(,)를 기준으로 구분)");
        return sc.nextLine().split(",");
    }

    public static int getTrials() {
        System.out.println("시도 할 회수는 몇 회 인가요?");
        return sc.nextInt();
    }
}
