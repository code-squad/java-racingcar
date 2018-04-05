package com.ohahohah.step01;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

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
  public void 입력받은_자동차수대로_자동차_인스턴스_생성() {
      assertThat(rc.createCars(3).size()).isEqualTo(3);
  }

}