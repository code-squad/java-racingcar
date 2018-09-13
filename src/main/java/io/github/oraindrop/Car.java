package io.github.oraindrop;

public class Car implements Comparable<Car>{
    static final int FORWARD_CONDITION = 4;

    private String name;
    private int score;

    public Car(String name) {
        this.name = name;
        this.score = 0;
    }

    public String getName() {
        return this.name;
    }

    public int getScore() {
        return this.score;
    }

    public void decideForward(int randomNum) {
        if(randomNum >= FORWARD_CONDITION){
            this.score++;
        }
    }

    @Override
    public int compareTo(Car c1) {
        if(this.score > c1.score) return -1;
        if(this.score < c1.score) return 1;
        return 0;
    }
}
