package racingGame;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RacingGame {

    private int time; // 시도회수

    private List<Integer> position; // 차들의 위치

    public static void main(String[] args) {

        System.out.println("자동차 대수는 몇 대인가요?");
        Scanner scanner = new Scanner(System.in);

        int time = scanner.nextInt();

        System.out.println("시도할 회수는 몇 회인가요?");
        int carNum = scanner.nextInt();

        RacingGame racingGame = new RacingGame(time,carNum);
        racingGame.move();

    }

    public RacingGame(int time, int carNum) {
        this.time = time;
        this.position = setupPosition(carNum);
    }

    public void move() {

        for(int i=0; i<time; i++) {
            runDice();
        }
        print();
    }

    private void print() {
        String result = "";
        for(int i=0; i<position.size(); i ++) {
            result += getAdvancePrint(position.get(i));
        }
        System.out.println(result);
    }

    private String getAdvancePrint(int advanceNum) {
        String position = "";
        for(int i=0; i<advanceNum; i++) {
            position+="-";
        }
        return position += "\n";
    }

    private void runDice() {
        for(int i=0; i<position.size(); i++) {
            int random = (int) (Math.random() * 10);

            if(isAdvance(random)) {
                advance(i);
            }
        }
    }

    private void advance(int carposition) {
        int currentPosition = position.get(carposition);
        position.set(carposition,++currentPosition);
    }

    //처음 차들 셋팅
    private List<Integer> setupPosition(int carNum) {
        List<Integer> position = new ArrayList<>();
        for(int i=0; i<carNum; i++) {
            position.add(0);
        }
        return position;
    }

    // 전진할지
    private boolean isAdvance(int random) {
        int standard = 4;

        if(random >= standard ) {
            return true;
        }
        return false;
    }


}
