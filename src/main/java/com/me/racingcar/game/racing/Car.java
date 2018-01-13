package com.me.racingcar.game.racing;

public class Car{
    private String name;
    private int position = 0;

    public Car(String name){
        this.name = name;
    }

    public int move(int value){
        if(value >= 4){
            position++;
        }
        return position;
    }

    public String printPosition(){
        StringBuilder builder = new StringBuilder();
        for(int i=0 ; i<position ; i++) {
            builder.append("-");
        }
        return builder.toString();
    }

    public int getPosition() {
        return position;
    }

    @Override
    public String toString() {
        return this.name + "("+this.position+") : "+printPosition();
    }


}
