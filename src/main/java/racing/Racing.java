package racing;



import java.util.*;
import java.util.Random;

/**
 * 기능 요구사항
 * 초간단 자동차 경주 게임을 구현한다.
 * 주어진 횟수 동안 n대의 자동차는 전진 또는 멈출 수 있다.
 * 사용자는 몇 대의 자동차로 몇 번의 이동을 할 것인지를 입력할 수 있어야 한다.
 * 전진하는 조건은 0에서 9 사이에서 random 값을 구한 후 random 값이 4이상일 경우이다.
 * 자동차의 상태를 화면에 출력한다. 어느 시점에 출력할 것인지에 대한 제약은 없다.
 *
 * 프로그래밍 요구사항
 * 메소드가 너무 많은 일을 하지 않도록 분리하기 위해 노력해 본다.
 * 규칙 2: else 예약어를 쓰지 않는다.
 * 모든 로직에 단위 테스트를 구현한다. 단, UI(System.out, System.in) 로직은 제외
 * naming convention을 지키면서 프로그래밍한다.
 *
 * 2단계 기능 요구사항
 * 각 자동차에 이름을 부여할 수 있다. 전진하는 자동차를 출력할 때 자동차 이름을 같이 출력한다.
 * 자동차 이름은 쉼표(,)를 기준으로 구분한다.
 * 자동차 경주 게임을 완료한 후 누가 우승했는지를 알려준다. 우승자는 한명 이상일 수 있다.
 *
 */

public class Racing {

    public static List<List<Integer>> startRace(int cars, int times) {
        return getGameResult(cars, times, null, null);
    }

    public static List<HashMap<String, Integer>> startRaceWithName(String[] names, int times) {
        return getGameResultWithName(names, times, null, null);
    }

    private static List<List<Integer>> getGameResult(int cars, int times, List<Integer> acc, List<List<Integer>> result) {

        if (times == 0) {
            return result;
        }

        if (result == null)
            result = new ArrayList<>();

        if (acc == null) {
            acc = new ArrayList<>();

            for (int i = 0; i < cars; i++)
                acc.add(i, 0);

        }

        for (int i=0; i<acc.size(); i++) {
            if (assertCanGo())
                acc.set(i, acc.get(i) + 1);
        }

        result.add(new ArrayList<>(acc));

        return getGameResult(cars, --times, acc, result);

    }

    private static List<HashMap<String, Integer>> getGameResultWithName(String[] names, int times, HashMap<String, Integer> acc, List<HashMap<String, Integer>> result) {

        if (times == 0)
            return result;

        if (result == null)
            result = new ArrayList<>();

        if (acc == null) {
            acc = new HashMap<>();

            for (int i=0; i<names.length; i++)
                acc.put(names[i], 0);
        }

        for (int i=0; i<acc.size(); i++) {
            if (assertCanGo())
                acc.put(names[i], acc.get(names[i]) + 1);
        }

        result.add(new HashMap<>(acc));

        return getGameResultWithName(names, --times, acc, result);

    }


    public static boolean assertCanGo() {
        return generateRandomNumber(9) >= 4;
    }

    public static int generateRandomNumber(int bound) {
        return new Random().nextInt(bound);
    }

}
