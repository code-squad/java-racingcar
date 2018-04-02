package race;

import static org.hamcrest.CoreMatchers.is;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.HashMap;
import java.util.Map;

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
        car.move(rule);
        Map<String, Recorder> records = new HashMap<>();
        records.put(racerName, car.getRecorder());

        //when
        drawer.draw(records, 3);

        //then
        String expected = "racer1: -\n\nracer1: --\n\nracer1: ---\n\n";
        Assert.assertThat(outputCapture.toString(), is(expected));
    }

    private static class TestRule implements RaceRule {
        @Override
        public boolean canMove(int randomValue) {
            return true;
        }
    }
}