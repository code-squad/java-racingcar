import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.DisplayName;

import static org.junit.Assert.assertEquals;

public class CarTest {
    Car car;

    @Before
    public void setUp() {
        car = new Car();
    }

    @Test
    @DisplayName("랜덤값 동작 테스트-4이상")
    public void OneRunTestNumber1() {
        int originPosition = car.getPosition();
        car.oneRun(4);
        assertEquals(originPosition + 1, car.getPosition());
    }

    @Test
    @DisplayName("랜덤값 동작 테스트-4이하")
    public void OneRunTestNumber2() {
        int originPosition = car.getPosition();
        car.oneRun(3);
        assertEquals(originPosition, car.getPosition());
    }

    @Test
    @DisplayName("최고 포지션 맞추기 테스트-true")
    public void isWinnerPositionTestTrue(){
        // make get.Position == 100
        for (int i = 0; i < 100; i++) {
            car.oneRun(4);
        }
        assertEquals(true, car.isWinnerPosition(100));
    }

    @Test
    @DisplayName("최고 포지션 맞추기 테스트-false")
    public void isWinnerPositionTestFalse(){
        // make get.Position == 100
        for (int i = 0; i < 100; i++) {
            car.oneRun(4);
        }
        assertEquals(false, car.isWinnerPosition(99));
    }
}

