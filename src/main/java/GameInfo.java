
public class GameInfo {

    private static final int RANDOM_NUM = 10;
    private static final int POSSIBLE_MOVE_NUM = 4;

    private static Car[] cars;

    public static Car[] cars(int name, String[] names) {
        cars = new Car[name];
        for (int i = 0; i < name; i++) {
            cars[i] = new Car(names[i]);
        }
        return cars;
    }

    public static Car play(int move, Car[] cars) {
        for (int j = 0; j < move; j++) {
            insidePlayGame(cars);
        }
        return null;
    }

    //playGame 안에 들어가 있는 메소드
    private static void insidePlayGame(Car[] cars) {
        for (int i = 0; i < cars.length; i++) {
            // Main cars의 인스턴스.
            cars[i].plusMove(checkMove(randomNum()));
        }
    }

    //랜덤숫자 만듬

    public static int randomNum() {
        int random;
        random = (int) (Math.random() * RANDOM_NUM);
        return random;
    }

    //     메소 랜덤값을 통해서 이동, 4이상 부터 체크
    public static int checkMove(int random) {
        if (random >= POSSIBLE_MOVE_NUM) {
            return 1;
        } else {
            return 0;
        }
    }

}

