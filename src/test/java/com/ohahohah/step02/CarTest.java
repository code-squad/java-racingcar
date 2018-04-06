package com.ohahohah.step02;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class CarTest {

  @Before
  public void setUp() throws Exception {
  }

  @After
  public void tearDown() throws Exception {
  }

  @Test
  public void 숫자에_따라서_전진횟수가_출력되는지_확인() {
    Car car = new Car();
    assertThat(car.stopOrGo(0)).isEqualTo(0);
    assertThat(car.stopOrGo(4)).isEqualTo(1);
    assertThat(car.stopOrGo(9)).isEqualTo(1);
  }

  @Test
  public void 입력값에_따라_자동차_위치가_변화하는지_확인() {
    Car car = new Car();
    int originCoor = car.getCoords();
    car.move(1);
    assertThat(car.getCoords()).isEqualTo(originCoor + 1);
  }

  @Test
  public void 자동차들을_현재_좌표가_큰_순서대로_정렬하는지_확인() {
    List<Car> actual = Arrays
        .asList(new Car("car01", 5), new Car("car02", 1), new Car("car03", 20),
            new Car("car04", 20));
    List<Car> expected = Arrays
        .asList(new Car("car03", 20), new Car("car04", 20), new Car("car01", 5), new Car("car02", 1)
        );

    Collections.sort(actual, Car.carCoordsComparator);
    assertThat(actual).isEqualTo(expected);
  }
}

