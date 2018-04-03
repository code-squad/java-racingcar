package racingGame;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by hongjong-wan on 2018. 3. 31..
 */
public class RacingGameTest {

    /**

     [1]
        기능구현전 기능 요구사항을 보고 테스트케이스가 3개쯤 될것으로 판단

        # 테스트 케이스 정리
         1. 자동차 수 (양수,음수)
         2. 시도 횟수 (양수 음수)
         3. 이동여부

        하지만 자동차수와 시도횟수에 해당하는 테스트코드를 작성하는 부분에서 의문점이 생김

        왜냐하면 테스트 코드를 작성하려면 사용자가 값을 입력했다고 가정해야하는데
        그것을 표현하기위해 아래처럼 carNum 변수값을 하드코딩으로 양수로 했다가 다음에는 음수로 했다가 함
        이런식으로해서 테스트코드를 돌려봄

        테스트코드가 통과되면 그때 하드코딩한 부분을 Scanner로 변경함
        이런식으로 하는게 맞는것인가 의문이 들었음

        public static int getCarNum() {
            System.out.print("자동차 수를 입력하세요: ");
            int carNum = 2;

            if (carNum < 0) {
                throw new IllegalArgumentException();
            }

            return carNum;
        }


     [2]
        production코드에서 racing() 메소드가 핵심이라고 생각하는데
        해당 부분을 테스트코드로 작성하는것은 더더욱 어려웠음

        racing() 메소드 안에 있는 getRandom() 메소드야 테스트 코드 수행을위해
        특정 숫자로 변경한다하더라도 display() 메소드부분은 어떻게해야하는지 모르겠음

     */

//    @Test
//    public void 자동차수_양수() {
//        assertEquals(2, RacingGame.getCarNum());
//    }
//
//    @Test(expected = IllegalArgumentException.class)
//    public void 자동차수_음수() {
//        assertEquals(-2, RacingGame.getCarNum());
//    }



//    @Test
//    public void 시도횟수_양수() {
//        assertEquals(2, RacingGame.getTryCount());
//    }
//
//    @Test(expected = IllegalArgumentException.class)
//    public void 시도횟수_음수() {
//        assertEquals(-2, RacingGame.getTryCount());
//    }

}
