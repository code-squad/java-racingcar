package race;

import org.assertj.core.api.Assertions;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.Arrays;

public class DrawerTest {
    private Drawer drawer;
    private RaceRule rule;

    private ByteArrayOutputStream outputCapture;

    @Before
    public void setUp() {
        rule = new TestRule();
        outputCapture = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputCapture));
    }

    @Test
    public void lineDrawer_레이스카의_기록을_라인으로_출력한다() {
        //given
        String racerName = "racer1";
        drawer = new LineDrawer();
        RaceCar car = new RaceCar(racerName);
        car.move(rule);
        car.move(rule);

        //when
        drawer.draw(Arrays.asList(car), 2);

        //then
        String expected = "racer1: -\n\nracer1: --\n\n";
        Assertions.assertThat(outputCapture.toString()).isEqualTo(expected);
    }

    private static class TestRule implements RaceRule {
        @Override
        public boolean canMove(int randomValue) {
            return true;
        }
    }
}