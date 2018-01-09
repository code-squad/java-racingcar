package car;

public class Car {

  private static final int MOVED_CONDITION = 3;
  private String name;
  private int position;

  public Car(String name) {
    this.name = name;
  }

  public String getName() {
    return name;
  }

  public int getPosition() {
    return position;
  }

  public int move(int value) {
    if (canMove(value)) {
      return ++position;
    }
    return position;
  }

  private boolean canMove(int condition) {
    return condition > MOVED_CONDITION;
  }

  @Override
  public String toString() {
    return "Car{" +
        "name='" + name + '\'' +
        ", position=" + position +
        '}';
  }
}
