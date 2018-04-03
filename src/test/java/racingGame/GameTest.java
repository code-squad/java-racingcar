package racingGame;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class GameTest {
    //3. Pobi님 Game class의 메소드들 안에 사용된 Car, Printer의 메소드들이 테스트를 통과했다면,
    //Game Class의 메소드들도 검증되었다고 볼 수 있을까요?

    Game game;

    @Before
    public void setUp(){
        game = new Game();
    }

    @After
    public void tearDown(){
        game = null;
    }
}
