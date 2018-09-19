package racingcar;

import java.util.ArrayList;

public class Run {
    InputView ip = new InputView();
    ArrayList<Car> cars = new ArrayList<>();

    public void paly() {
        ip.input();
        ip.moveNumber();
        carinstuns();

        for (int i = 0; i < ip.time; i++) {
            comparison();
        }

        printRun();
        win();
    }

    public void carinstuns() {              //객체 생성
        for (int i = 0; i < ip.cutName.length; i++)
            cars.add(new Car(ip.cutName[i]));
    }

    public void comparison() {              //랜덤값 반복
        for (int i = 0; i < cars.size(); i++)  //자동차 만큼 돌아간다.
            cars.get(i).moveRandom();            //랜덤을 실행하라.[랜덤값 입력됨]

    }

    public void printRun() {                  //출력
        System.out.println("출력 결과");
        for (int i = 0; i < cars.size(); i++) {
            System.out.print(cars.get(i).name + " : ");
            checkRun(cars.get(i).moveMax);
            System.out.println();
        }
        System.out.println();
    }

    public void checkRun(int num) {
        for (int i = 0; i < num; i++)
            System.out.print("-");
    }

    public void win() {                     //최종값 출력
        int num = 0;
        for (int i = 0; i < cars.size(); i++) {
            num = getNum(num, i);
        }
        winCheck(num);

    }

    private int getNum(int num, int i) {
        if (num < cars.get(i).moveMax) {
            num = cars.get(i).moveMax;
        }
        return num;
    }

    public void winCheck(int num) {
        ArrayList<String> winner = new ArrayList<>();
        for (int i = 0; i < cars.size(); i++) {
            winCheckMax(num, winner, i);
        }

        System.out.println(String.join(",", winner) + " 최종 우승자 입니다.");
    }

    private void winCheckMax(int num, ArrayList<String> winner, int i) {
        if (num == cars.get(i).moveMax) {
            winner.add(cars.get(i).name);
        }
    }
}
