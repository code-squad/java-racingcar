package RacingGame;

public class Car {

    private int carPosition;

    public int getCarPosition(){
        return carPosition;
    }

    /**
     * 입력된 값에 따라 이동 여부를 반환하는 메서드
     * @param ranNum 입력된 랜덤 값
     * @return 이동 여부(Y:1, N:0)
     */
    public void movePosition(int ranNum) {
        if(ranNum>=4){
            carPosition++;
        }
    }

}
