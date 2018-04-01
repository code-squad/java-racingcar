package race;

import static org.hamcrest.CoreMatchers.is;

import com.google.common.collect.ImmutableList;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.List;

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
        drawer = new LineDrawer();
        RaceCar car = new RaceCar();
        car.move(rule);
        car.move(rule);
        car.move(rule);
        List<Recorder> recorders = ImmutableList.of(car.getRecorder());

        //when
        drawer.draw(recorders);

        //then
        Assert.assertThat(outputCapture.toString(), is("-\n--\n---\n\n"));
    }

    private static class TestRule implements RaceRule {
        @Override
        public boolean canMove(int randomValue) {
            return true;
        }
    }
}