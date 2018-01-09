package game;

import java.util.stream.IntStream;

public class Result {

  private static final char PRINT_BAR = '-';
  private String name;
  private int position;

  public Result(String name, int position) {
    this.name = name;
    this.position = position;
  }

  public String getName() {
    return name;
  }

  public int getPosition() {
    return position;
  }

  public String drawResultLine() {
    return name + " : " + printBar(position) + "\n";
  }

  private String printBar(int count) {
    char[] bar = new char[count];
    IntStream.range(0, count).forEach(i -> bar[i] = PRINT_BAR);
    return new String(bar);
  }
}
