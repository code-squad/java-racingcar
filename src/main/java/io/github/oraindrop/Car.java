package io.github.oraindrop;

import java.util.List;

public class Car implements Comparable<Car>{
    static final int FORWARD_CONDITION = 4;

    private String name;
    private String result;
    private boolean winFlag;

    public Car(String name) {
        this.name = name;
        this.result = "";
        this.winFlag = false;
    }

    public String getName() {
        return this.name;
    }

    public String getResult() {
        return this.result;
    }

    public boolean isWinFlag() {
        return this.winFlag;
    }

    public void decideWinFlag(int maxScore){
        if(maxScore == this.result.length()){
            this.winFlag = true;
        }
    }

    public void decideForward(int randomNum) {
        if(randomNum >= 4){
            this.result += "-";
        }
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + this.name + '\'' +
                ", result='" + this.result + '\'' +
                '}';
    }

    @Override
    public int compareTo(Car c1) {
        if(this.result.length() > c1.getResult().length()) return -1;
        if(this.result.length() < c1.getResult().length()) return 1;
        return 0;
    }
}
