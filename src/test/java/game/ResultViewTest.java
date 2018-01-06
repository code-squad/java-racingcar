package game;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ResultViewTest {

  @Test
  public void drawView() {
    assertEquals("---\n---\n----", ResultView.drawView(new int[]{3, 3, 4}));
  }
}
