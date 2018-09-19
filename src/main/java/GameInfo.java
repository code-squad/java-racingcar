
public class GameInfo {

    static final int RANDOM_NUM = 10;
    static final int POSSIBLE_MOVE_NUM = 4;

    Car[] cars = null;

    //자동차 위치때문에 생성자 만듬.
    //자동차 위치를 가져와 playGame에서 사용해야 하기 때문!
    public GameInfo( Car[] cars) {
        this.cars = cars;
     }

    //자동차 게임 실행 시켜주는 메소드
    public void playGame(int move, Car[] cars) {
        for(int j = 0; j < move; j++) {
            InsidePlayGame(cars);
        }
    }
    //playGame 안에 들어가 있는 메소드
    private void InsidePlayGame(Car[] cars) {
        for (int i = 0; i < cars.length; i++) {
            // Main cars의 인스턴스.
            cars[i].plusMove(checkMove(randomNum()));
        }
    }

    //랜덤숫자 만듬
    public static int  randomNum() {
        int random;
        random = (int)(Math.random() * RANDOM_NUM);
        return random;
    }

//     메소 랜덤값을 통해서 이동, 4이상 부터 체크
    public int checkMove(int random) {
        if(random >= POSSIBLE_MOVE_NUM) {
            return 1;
        }else{
            return 0;
        }
    }

}
