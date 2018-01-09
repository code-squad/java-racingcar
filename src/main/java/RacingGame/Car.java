package RacingGame;

public class Car {
    /**
     * 자동차 이동 여부를 지정하는 ENUM
     * Y 이동 1
     * N 정지 0
     */
    private enum GOYN{
        Y(1), N(0);

        int value;
        GOYN(int value) {
            this.value = value;
        }
        public int getValue(){
            return value;
        }
    }

    private int carPosition;

    public int getCarPosition(){
        return this.carPosition;
    }

    /**
     * 자동차를 이동 시키는 메서드
     * @param moveCount 이동거리
     */
    public void movePosition(int moveCount){
        this.carPosition += moveCount;
    }

    /**
     * 입력된 값에 따라 이동 여부를 반환하는 메서드
     * @param ranNum 입력된 랜덤 값
     * @return 이동 여부(Y:1, N:0)
     */
    public int moveYn(int ranNum) {
        if(ranNum>=4){
            return GOYN.Y.getValue();
        }

        return GOYN.N.getValue();
    }

}
