package com.ohahohah.step01;

import static com.ohahohah.step01.Parser.checkDigit;

import org.junit.Test;

public class ParserTest {

  @Test(expected = IllegalArgumentException.class)
  public void 숫자가_아닐_경우_IllegalArgumentException_던짐() {
    checkDigit("noDigit");
  }

}
