package racing;

import java.util.Random;

public class Racing {
    static final int stopStandard = 4;
    static final int randomStandard = 10;
    private int time;
    private int[] carPositions; //  다른 클래스에서는 결과값을 변경하지 못하도록 private 설정!
    Random random;

    Racing(int time, int n) {
        this.time = time;
        this.carPositions = new int[n];
        this.random = new Random();

        init();
    }

    public void init() {
        /* 초기값을 1로 초기화 */
        for (int i = 0; i < carPositions.length; i++)
            carPositions[i] = 1;
    }

    public void run() {
        /* 반복횟수만큼 움직임(4 ~ 9) */
        for (int i = 0; i < time; i++) {
            for (int j = 0; j < carPositions.length; j++) {
                carPositions[j] += getNum();
            }
        }
    }

    public int getNum() {
        /* 전진(4 이상) 또는 정지(4 미만) */
        int num = random.nextInt(randomStandard);
        return num >= stopStandard ? num : 0;
    }

    public void printRacingResult() {
        /* 경주 최종결과 출력 */
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < carPositions.length; i++) {
            for (int j = 0; j < carPositions[i]; j++) {
                sb.append("-");
            }
            sb.append("\n");
        }
        System.out.println(sb.toString());
    }
}
