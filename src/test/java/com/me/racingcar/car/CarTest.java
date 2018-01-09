package com.me.racingcar.car;

import org.junit.Before;
import org.junit.Test;

import java.util.Random;

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

    @Test
    public void printPosition(){
        Random random = new Random();
        int cnt = 100, position=0;
        for(int idx=0 ; idx<cnt ; idx++){
            position = car.move(random.nextInt(10));
        }

        assertTrue(position == car.printPosition().length());
    }

}