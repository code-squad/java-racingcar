package com.ohahohah.step0;

import java.util.ArrayList;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class ParserTest {

  Parser parser;

  @Before
  public void setUp() {
    this.parser = new Parser();
  }

  @After
  public void tearDown() {
  }

  @Test
  public void 문자열이_띄어쓰기_단위로_파싱되었는가() {

    assertThat(parser.parseStr("3 + 3")).isEqualTo(Stream
        .of("3", "+", "3").collect(Collectors.toCollection(ArrayList::new)));
  }

  @Test(expected = IllegalArgumentException.class)
  public void 입력값이_null이거나_빈문자열일_경우_IllegalArgument_exception_던짐() {
    parser.checkBlankStr("");

  }

  @Test
  public void 입력값이_숫자_또는_사칙연산_기호일_경우_pass() {

    parser.checkParamValidation("302342");
//    cal.checkParamValidation("+");
//    cal.checkParamValidation("-");
//    cal.checkParamValidation("*");
//    cal.checkParamValidation("/");

  }

  @Test(expected = IllegalArgumentException.class)
  public void 입력값이_숫자_또는_사칙연산_기호가_아닐_경우_IllegalArgument_exception_던짐() {

//    cal.checkParamValidation("3ㅁㄴㄹ");
//    cal.checkParamValidation("  ");
//    cal.checkParamValidation("+-");
    parser.checkParamValidation("+3~");

  }

  @Test(expected = IllegalArgumentException.class)
  public void 입력값이_정해진_형식이_아닐_경우_IllegalArgument_exception_던짐() {
    //정해진 형식 : 문자열의 처음과 끝은 숫자여야함. e.g.  3 * 3 / 2 - 5
    parser.checkParamsOrder("3 * 3 - 5 6 ");

  }
}