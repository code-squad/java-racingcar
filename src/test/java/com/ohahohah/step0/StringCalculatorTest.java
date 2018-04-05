package com.ohahohah.step0;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class StringCalculatorTest {


  private StringCalculator cal;

  @Before
  public void setUp() {
    this.cal = new StringCalculator();
  }

  @After
  public void tearDown() {
  }

  @Test
  public void 사칙연산실행() {
    assertThat(StringCalculator.doCals("3 * 3 / 2 - 6")).isEqualTo(-1.5);
//    assertThat(cal.doCals("3 - 3 / 0 * 5")).isEqualTo(Double.NaN);

  }
}

