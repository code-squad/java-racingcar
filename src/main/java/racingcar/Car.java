package racingcar;

import static racingcar.RacingGame.MOVE_CAR;

public class Car{
    private String name;
    private int position = 0;

    public Car(String name) {
        this.name = name;
    }
    public int getPosition() {
        return this.position;
    }
    public String getName() {
        return this.name;
    }

    // 포지션 값을 이렇게 증가시키라는 건가요 아직 부족해서 설명에 대한 이해력이 부족한것 같습니다.아니라면 조금 더 수정해보겠습니다.
    public void setPosition(int i) {
        if (i >= MOVE_CAR) {
            this.position ++;
        }
    }
    public boolean isMaxPosition(int i) {
        if (this.position == i) {
            return true;
        }
        return false;
    }

    public int compareMaxPosition(int max) {
        return Math.max(this.position, max);
    }
    public void printCarName() {
        System.out.print(this.name);
    }
    public void drawDash() {
        String dash = "";
        for (int i = 0; i < this.position; i++) {
            dash += "-";
        }
        System.out.println(dash);
    }
}