package com.ohahohah.step0;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;

public class CalculatorTest {

  @Test
  public void 덧셈_연산이_됨() {
    Calculator cal = new CalculatorSum();
    assertThat(cal.cal(3,3)).isEqualTo(6.0);

  }

  @Test
  public void 뺄셈_연산이_됨() {
    Calculator cal = new CalculatorMinus();
    assertThat(cal.cal(3,7)).isEqualTo(-4.0);

  }

  @Test
  public void 곱셈_연산이_됨() {
    Calculator cal = new CalculatorMultiple();
    assertThat(cal.cal(-1,4)).isEqualTo(-4.0);

  }

  @Test
  public void 나눗셈_연산이_됨() {
    Calculator cal = new CalculatorDivide();
    assertThat(cal.cal(-9,2)).isEqualTo(-4.5);
//    assertThat(cal.cal(-9,0)).isEqualTo(Double.NEGATIVE_INFINITY);
//    assertThat(cal.cal(0.0,0.0)).isEqualTo(Double.NaN);

  }
}