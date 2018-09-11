package io.github.oraindrop;

import java.util.List;

public class Car {
    static final int FORWARD_CONDITION = 4;

    private String name;
    private String result;

    public Car(String name) {
        this.name = name;
        this.result = "";
    }

    public String getName() {
        return name;
    }

    public String getResult() {
        return result;
    }

    public void decideForward(int randomNum) {
        if(randomNum >= 4){
            this.result += "-";
        }
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", result='" + result + '\'' +
                '}';
    }
}
