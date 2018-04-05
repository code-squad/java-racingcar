package com.ohahohah.step01;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;

public class ResultViewTest {

  @Test
  public void 자동차_현재_위치를_String형태로_리턴하는지_확인() {
    assertThat(ResultView.coordsToStr(4)).isEqualTo("----");
  }
}
