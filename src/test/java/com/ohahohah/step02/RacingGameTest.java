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
}