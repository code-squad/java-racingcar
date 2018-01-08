package RacingGame;

public class Car {
    /**
     * 자동차의 이동 여부를 판단하는 메서드
     * @param moveCnt 현재 저장되어있는 이동 횟수
     * @return 수정된 이동 횟수
     */
    public int moveYn(int ranNum, int moveCnt) {
        if(ranNum>=4){
            moveCnt++;
        }
        return moveCnt;
    }

}
