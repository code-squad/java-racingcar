package racing;
import java.util.*;

public class Racing {
    static final int STOP_STANDARD = 0;
    static final int START_STANDARD = 4;
    static final int RANDOM_STANDARD = 10;
    /* 변수명에는 타입을 넣지 말기 ex) RESULT_STRING */
    private int time;
    private Car[] cars;
    Random random;

    Racing(int time, String[] names) {
        cars = new Car[names.length];
        for(int i = 0; i < cars.length; i++)
            cars[i] = new Car(names[i]);

        random = new Random();
        this.time = time;
    }

    public void run() {
        /* 반복횟수만큼 움직임(4 ~ 9) */
        for(int i = 0; i < cars.length; i++)
            moveCar(cars[i], time);

    }

    public void moveCar(Car car, int time) {
        for (int i = 0; i < time; i++)
            car.move(getNum());

    }

    public int getNum() {
        /* 전진(4 이상) 또는 정지(4 미만) */
        int num = random.nextInt(RANDOM_STANDARD);
        return num >= START_STANDARD ? num : STOP_STANDARD;
    }

    public void printRacingResult() {
        /* 경주 최종결과 출력 */
        /* 문자열을 + 를 통해 연결을 하면, 연결할때마다 String 객체를 계속 생성해야 하기 때문에 StringBuilder 사용 */
        /*
          StringBuilder vs String vs StringBuffer
            1. String
                String은 새로운 값을 할당할 때마다 새로 생성
                생성될때마다 변수와 메소드를 계속 생성
                    --> final char[] 형식이기 때문에 수정불가!
                String이 생성될때마다 게속 스택에 쌓임(가비지컬렉션이 동작할때까지 주소값이 스택에 남음, String 객체는 힙 영역에 남음)
                    --> 메모리 관점에서 비효율
            2. StringBuilder
                String과 달리 계속 생성되지 않고, 더해지는 방식

            3. StringBuffer
                Thread Safe
        */
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < cars.length; i++)
            sb.append(cars[i].getCarDistance() + "\n");

        System.out.println(sb.toString());
    }

    public void printWinners() {
        /* 최종 우승자들 출력 */
        String winners = getWinners();
        System.out.println(winners.substring(0, winners.length() - 2) + "가 최종 우승했습니다.");
    }

    public String getWinners() {
        StringBuilder sb = new StringBuilder();
        Arrays.sort(cars);
        for(int i = 0; i < cars.length; i++)
            sb.append(cars[i].getWinner(cars[0]));

        sb.append("\n");
        return sb.toString();
    }
}