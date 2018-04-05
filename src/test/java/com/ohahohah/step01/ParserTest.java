package com.ohahohah.step01;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;

public class ParserTest {

  @Test(expected = IllegalArgumentException.class)
  public void 숫자가_아닐_경우_IllegalArgumentException_던짐() {
    Parser.checkDigit("noDigit");
  }

  @Test
  public void 문자를_입력하면_int형으로_반환하는지_확인() {
    assertThat(Parser.changeInt("3")).isEqualTo(3);
  }
}
