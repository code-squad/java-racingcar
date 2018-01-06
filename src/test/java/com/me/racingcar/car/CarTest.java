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
    public void move_under_4(){
        car.move(3);
    }

}