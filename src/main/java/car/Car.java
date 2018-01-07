package car;

public class Car {

  private String name;
  private int position;
  private MoveCondition moveCondition;

  public Car(String name) {
    this.name = name;
  }

  public Car(String name, MoveCondition moveCondition) {
    this.name = name;
    this.moveCondition = moveCondition;
  }

  public void setMoveCondition(MoveCondition moveCondition) {
    this.moveCondition = moveCondition;
  }

  public String getName() {
    return name;
  }

  public int getPosition() {
    return position;
  }

  public int move() {
    int movedGenerateValue = moveCondition.getMovedGenerateValue();
    if (isMovedCondition(movedGenerateValue)) {
      return ++position;
    }
    return position;
  }

  private boolean isMovedCondition(int condition) {
    return condition > 3;
  }

  @Override
  public String toString() {
    return "Car{" +
        "name='" + name + '\'' +
        ", position=" + position +
        '}';
  }
}
