package com.ohahohah.step0;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class CaculatorTest {

  private Caculator cal;

  @Before
  public void setUp() throws Exception {
    this.cal = new Caculator();
  }

  @After
  public void tearDown() throws Exception {
  }

  @Test
  public void 덧셈_연산이_됨() {
    assertThat(cal.sum(3,3)).isEqualTo(6.0);

  }

  @Test
  public void 뺄셈_연산이_됨() {
    assertThat(cal.subtract(3,7)).isEqualTo(-4.0);

  }

  @Test
  public void 곱셈_연산이_됨() {
    assertThat(cal.multiple(-1,4)).isEqualTo(-4.0);

  }

  @Test
  public void 나눗셈_연산이_됨() {
    assertThat(cal.divide(-9,2)).isEqualTo(-4.5);
//    assertThat(Double.isInfinite(cal.divide(-9,0)));
//    assertThat(Double.isNaN(cal.divide(0.0,0.0)));

  }
}