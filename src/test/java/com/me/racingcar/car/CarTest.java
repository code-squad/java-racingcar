package com.me.racingcar.car;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CarTest {
    private Car car;

    @Before
    public void setup(){
        car = new Car("test-1");
    }

    @Test
    public void move_value_under_4(){
        int curPosition = car.move(3);
        assertTrue(0 == curPosition);
    }

    @Test
    public void move_value_ge_4(){
        int curPosition = car.move(4);
        assertTrue(0 < curPosition);
    }

}