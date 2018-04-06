package com.ohahohah.step02;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.Arrays;
import java.util.List;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class RacingGameTest {

  RacingGame rc;

  @Before
  public void setUp() {
    this.rc = new RacingGame();
  }

  @After
  public void tearDown() {
  }

  @Test
  public void 입력받은_자동차_이름수대로_자동차_인스턴스_생성() {
    assertThat(rc.createCars(Arrays.asList("car01", "car02", "car03")).size()).isEqualTo(3);
  }

  @Test
  public void 가장_먼_거리_간_자동차를_우승자로_선택하는지_확인() {
    List<Car> actual = Arrays
        .asList(new Car("car01", 5), new Car("car02", 1), new Car("winner01", 20),
            new Car("winner02", 20));

    assertThat(rc.pickWinner(actual)).isEqualTo(Arrays.asList("winner01", "winner02"));

  }
}