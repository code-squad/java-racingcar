package com.ohahohah.step01;

import static org.junit.Assert.*;

import java.util.concurrent.ThreadLocalRandom;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class CarTest {
  Car car;

  @Before
  public void setUp() throws Exception {
    car = new Car(1,0);
  }

  @After
  public void tearDown() throws Exception {
  }

  //즉시 출력할 경우, 이동횟수가 필요없어서 삭제함
//  @Test
//  public void 전진_또는_멈출_경우_이동횟수가_증가하는지_확인() {
//    int currentTurn = car.getTurn();
//    car.stopOrGo();
//    assertThat(car.getTurn()).isEqualTo(currentTurn+1);
//  }
}