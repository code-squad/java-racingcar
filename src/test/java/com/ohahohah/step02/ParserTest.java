package com.ohahohah.step02;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.Arrays;
import org.junit.Test;

public class ParserTest {

  @Test(expected = IllegalArgumentException.class)
  public void 빈_문자열일_경우_IllegalArgumentException_던짐() { Parser.checkBlank("  "); }

  @Test(expected = IllegalArgumentException.class)
  public void 숫자가_아닐_경우_IllegalArgumentException_던짐() {
    Parser.checkDigit("noDigit");
  }

  @Test
  public void 문자를_입력하면_int형으로_반환하는지_확인() {
    assertThat(Parser.changeInt("3")).isEqualTo(3);
  }

  @Test
  public void 문자를_입력하면_List형으로_반환하는지_확인() {
    assertThat(Parser.changeStrList("name01,name02,name03")).isEqualTo(Arrays.asList("name01","name02","name03"));
  }
}
