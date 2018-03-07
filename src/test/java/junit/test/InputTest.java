package junit.test;

import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

import static org.junit.Assert.*;

public class InputTest {
    Input s;

    @Before
    public void setUp() {
        s = new Input();
    }

    @Test
    public void scanInput() {
        String input = "5";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        assertEquals("5", s.scanInput());
    }

    @Test
    public void convertToInt() {
        int[] num = s.convertToInt("5 6");
        assertArrayEquals(new int[]{5, 6}, num);
    }
}