/*
o. Scanner로 ,를 이용해 입력받은 이름 가르기
o. 잘라낸 이름으로 생성자를 이용하여 객체 생성
o. 동작값 입력 받기

o. 입력받은 동작값 만큼 각 이름의 자동차 객체에 배열 size 지정 => 동작
o. 배열값 랜덤 입력 [9까지]  =동작
--각 배열 랜덤값 확인 --> 필수 아님 => 동작

o. 4 이상일 경우 -를 찍을 것, 아닐 경우 동작을 하지 않는다.
--    for문, if문 사용  =>동작
o. 출력 [차 이름  :  ----]  => 출력
8. 찍힌 값 비교  => 동작
9. 최고 값 불러오기.[중복 가능]  => 동작
10. 출력 ==>출력
 */
package racingcar;

import java.util.Random;

public class Car {
    public static final int RANDOM_NUM = 9;
    public static final int RANGE = 4;
    private String name; //car 이름값 입력
    private int moveMax;

    public Car(String name) {           //생성자
        this.name = name;
    }

    public int moveRandom() {
        Random r = new Random();
        int num = r.nextInt(RANDOM_NUM);
        lncrease(num);
        return moveMax;
    }

    private void lncrease(int num) {
        if (num >= RANGE) {
            moveMax++;
        }
    }

    public String getName() {
        return name;
    }

    public int getMoveMax() {
        return moveMax;
    }
}
