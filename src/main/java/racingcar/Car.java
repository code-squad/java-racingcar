package racingcar;

import java.util.Random;

public class Car {
    private String name;
    private int position = 0;

    public Car(String name){
        this.name = name;
    }

    public Car(String name, int pos){
        this.name = name;
        this.position = pos;
    }

    public void run() {
        Random rnd = new Random();
        if (rnd.nextInt(10) >= 4)
            position += 1;
    }

    public String getUserName(){
        return name;
    }

    public int getPosition(){
        return position;
    }

    public void desh(){
        for (int j = 0; j < position; j++) {
            ResultView.printDesh();
        }
    }

    public int findMaxPos(int maxPos){
        if(this.position > maxPos){
            return this.position;
        }
        return maxPos;
    }

    public boolean isMaxPos(int maxPos){
        return this.position == maxPos;
    }
}
