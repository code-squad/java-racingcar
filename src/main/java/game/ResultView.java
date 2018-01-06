package game;

public class ResultView {
  public static String drawView(int[] positions) {
    StringBuilder sb = new StringBuilder();
    for (int i = 0; i < positions.length; i++) {
      for (int j = 0; j < positions[i]; j++) {
        sb.append("-");
      }
      if (i != positions.length - 1) {
        sb.append("\n");
      }
    }
    return sb.toString();
  }
}
