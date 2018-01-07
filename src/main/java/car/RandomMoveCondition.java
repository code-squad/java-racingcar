package car;

import java.util.Random;

public class RandomMoveCondition implements MoveCondition {

  @Override
  public int getMovedGenerateValue() {
    return new Random().nextInt(10);
  }
}
