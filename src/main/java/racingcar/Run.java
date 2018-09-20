package racingcar;

import java.util.ArrayList;

public class Run {
    public static final String OUT_COMMMA = "-";
    ArrayList<Car> cars = new ArrayList<>();

    public void play(String[] car, int time) {
        carinstuns(car);
        randomCamparison(time);
        printRun();
        win();
    }

    private void randomCamparison(int time) {
        for (int i = 0; i < time; i++) {
            comparison();
        }
    }

    public String[] carNumverCut(String car) { //이름 자르기[입력] 사용 ok
        return car.split(",");
    }

   public void carinstuns(String[] car) {              //객체 생성
        for (int i = 0; i <car.length; i++)
            cars.add(new Car(car[i]));
    }

    public void comparison() {              //랜덤값 반복
        for (int i = 0; i < cars.size(); i++)  //자동차 만큼 돌아간다.
            cars.get(i).moveRandom();            //랜덤을 실행하라.[랜덤값 입력됨]
    }

    public void printRun() {                  //출력
        System.out.println("출력 결과");
        for (int i = 0; i < cars.size(); i++) {
            System.out.print(cars.get(i).getName() + " : ");
            checkRun(cars.get(i).getMoveMax());
            System.out.println();
        }
        System.out.println();
    }

    public void checkRun(int num) {
        for (int i = 0; i < num; i++)
            System.out.print(OUT_COMMMA);
    }

    public void win() {                     //최종값 출력
        int num = 0;
        for (int i = 0; i < cars.size(); i++) {
            num = getNum(num, i);
        }
        winCheck(num);
    }

    private int getNum(int num, int i) {
        if (num < cars.get(i).getMoveMax()) {
            num = cars.get(i).getMoveMax();
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
        if (num == cars.get(i).getMoveMax()) {
            winner.add(cars.get(i).getName());
        }
    }
}
