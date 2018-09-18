package com.zingoworks.racing;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class CarTest {

    @Test
    public void updatePosition() {
        int i = 0;
        while (i < 100) {
            Car c1 = new Car("zingo", 0);
            c1.updatePosition();
            System.out.println(c1.extractPosition());
            i++;
        }
    }

    @Test
    public void extractPosition() {
        Car c2 = new Car("zingo", 0);
        assertThat(c2.extractPosition()).isEqualTo(0);
    }

    @Test
    public void extractNameOfCar() {
        Car c3 = new Car("zingo", 0);
        assertThat(c3.extractNameOfCar()).isEqualTo("zingo");
    }
}