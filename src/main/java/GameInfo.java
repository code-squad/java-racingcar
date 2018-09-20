
public class GameInfo {

    static final int RANDOM_NUM = 10;
    static final int POSSIBLE_MOVE_NUM = 4;

    private int carPosition = 0;
    private String name;

    GameInfo[] cars = null;

    public void plusMove(int num) {
        this.carPosition += num;
    }

    public String getName() {
        return this.name;
    }

    public int getCarPosition() {
        return this.carPosition;
    }

    public GameInfo(String name) {
        this.name = name;
    }

    public static void play(int move, GameInfo[] cars) {
        for (int j = 0; j < move; j++) {
            insidePlayGame(cars);
        }
    }

    //playGame 안에 들어가 있는 메소드
    private static void insidePlayGame(GameInfo[] cars) {
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
