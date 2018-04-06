package com.ohahohah.step02;

import static org.assertj.core.api.Assertions.assertThat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * 자동차 경주게임 결과 testcase
 */
public class GameResultTest {

  GameResult gameResult = null;

  @Before
  public void setUp() throws Exception {
    List<Car> cars = new ArrayList<>(Arrays
        .asList(new Car("car01", 2), new Car("winner01", 3), new Car("winner02", 3),
            new Car("car02", 1)));
    gameResult = new GameResult(cars);
  }

  @After
  public void tearDown() throws Exception {
  }

  @Test
  public void 입력된_좌표와_같은_좌표를_가진_인덱스를_반환하는지_확인() {
    assertThat(gameResult.getSameCoords(2)).isEqualTo(new ArrayList<>(Arrays.asList(0)));
    assertThat(gameResult.getSameCoords(3)).isEqualTo(new ArrayList<>(Arrays.asList(1, 2)));
  }

  @Test
  public void 가장_좌표값이_큰_자동차들의_이름을_반환하는지_확인() {
    assertThat(gameResult.getWinnerNames())
        .isEqualTo(new ArrayList<String>(Arrays.asList("winner01", "winner02")));
  }
}