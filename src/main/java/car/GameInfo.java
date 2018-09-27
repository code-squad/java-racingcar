package car;

public class GameInfo {

    private static final int RANDOM_NUM = 10;
    private static final int POSSIBLE_MOVE_NUM = 4;

    private Car[] cars;

    public GameInfo (String name){
        String[] names = name.split(",");
        cars = new Car[names.length];
        for(int i = 0; i < names.length; i++) {
            cars[i] = new Car(names[i]);
        }
    }

    public Car[] getCars() {
        return this.cars;
    }

    public void play(int move) {
        for (int j = 0; j < move; j++) {
            insidePlayGame(cars);
        }
    }

    //playGame 안에 들어가 있는 메소드
    private void insidePlayGame(Car[] cars) {
        for (int i = 0; i < cars.length; i++) {
            // main.Main cars의 인스턴스.
            cars[i].plusMove(checkMove(randomNum()));
        }
    }

    //랜덤숫자 만듬

    public int randomNum() {
        int random;
        random = (int) (Math.random() * RANDOM_NUM);
        return random;
    }

    //     메소 랜덤값을 통해서 이동, 4이상 부터 체크
    public int checkMove(int random) {
        if (random < POSSIBLE_MOVE_NUM) {
            return 0;
        }
        return 1;
    }

}

