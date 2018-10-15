package racingcar.domain;

public class Car {
    private static final int RANDOM_NUM = 9;
    private static final int RANGE = 4;
    private String name;    //car 이름값 입력
    private int move;    //자동차가 움직인 최종값 저장 변수

    public Car(String name) {           //생성자
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getMove() {
        return move;
    }

    public void setMove(int move) {
        this.move += move;
    }
}
