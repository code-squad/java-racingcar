package car;

public class Car {
  int position;

  public int move(int condition) {
    if (isMovedCondition(condition)) {
      return ++position;
    }
    return position;
  }

  public int getPosition() {
    return position;
  }

  private boolean isMovedCondition(int condition) {
    return condition > 3;
  }
}
