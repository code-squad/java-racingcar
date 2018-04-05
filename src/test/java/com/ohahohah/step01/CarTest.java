package com.ohahohah.step01;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class CarTest {

  Car car;

  @Before
  public void setUp() throws Exception {
    car = new Car(1, 0);
  }

  @After
  public void tearDown() throws Exception {
  }

  @Test
  public void 숫자에_따라서_전진횟수가_출력되는지_확인() {
    assertThat(car.stopOrGo(0)).isEqualTo(0);
    assertThat(car.stopOrGo(4)).isEqualTo(1);
    assertThat(car.stopOrGo(9)).isEqualTo(1);
  }

  @Test
  public void 입력값에_따라_자동차_위치가_변화하는지_확인() {
    int originCoor = car.getCoords();
    car.move(1);
    assertThat(car.getCoords()).isEqualTo(originCoor + 1);
  }

}

