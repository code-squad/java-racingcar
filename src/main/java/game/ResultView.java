package game;

import java.util.List;

public class ResultView {
  public static String drawView(List<Integer> positions) {
    StringBuilder sb = new StringBuilder();
    for (int i = 0; i < positions.size(); i++) {
      int position = positions.get(i);
      for (int j = 0; j < position; j++) {
        sb.append("-");
      }
      if (i != positions.size() - 1) {
        sb.append("\n");
      }
    }
    return sb.toString();
  }
}
