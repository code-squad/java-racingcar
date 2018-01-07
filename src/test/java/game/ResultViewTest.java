package game;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.List;
import org.junit.Test;

public class ResultViewTest {

  @Test
  public void drawView() {
    List<Integer> positions = Arrays.asList(3, 3, 4);
    assertEquals("---\n---\n----", ResultView.drawView(positions));
  }
}
