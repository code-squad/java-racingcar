package racingcar;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertEquals;
import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

public class CarTest {
    Car car1;
    Car car2;

    @Before
    public void setUpTest(){
        car1 = new Car("Finn");
        car2 = new Car("Pobi");
    }

    @Test
    public void moveTest(){
        assertTrue(car1.getPosition() == 0);
        assertTrue(car2.getPosition() == 0);

        car1.move(3);
        assertEquals(0, car1.getPosition());
        car1.move(5);
        assertEquals(1, car1.getPosition());
        car1.move(4);
        assertEquals(2, car1.getPosition());
        car1.move(9);
        assertEquals(3, car1.getPosition());

        car2.move(3);
        assertThat(car2.getPosition()).isEqualTo(0);
        car2.move(5);
        assertThat(car2.getPosition()).isEqualTo(1);
        car2.move(1);
        assertThat(car2.getPosition()).isEqualTo(1);
        car2.move(9);
        assertThat(car2.getPosition()).isEqualTo(2);
    }

    @Test
    public void judgeMaxPositionTest(){
        moveTest();

        car1.judgeMaxPosition();
        assertEquals(3, car1.getMaxPosition());

        car2.judgeMaxPosition();
        assertThat(car2.getMaxPosition()).isEqualTo(3);
    }

    @Test
    public void compareMaxPositionTest(){
        judgeMaxPositionTest();

        ArrayList<String> winners = new ArrayList<>();
        car1.compareMaxPosition(winners);
        car2.compareMaxPosition(winners);

        assertThat(winners.size()).isEqualTo(1);
        assertThat(winners.get(0)).isEqualTo("Finn");
        assertEquals(false, winners.contains("pobi"));
    }
}