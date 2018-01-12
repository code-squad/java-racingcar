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
        String rtn = "";
        for(int i=0 ; i<position ; i++){
            rtn += "-";
        }
        return rtn;
    }

    @Override
    public String toString() {
        return this.name + "("+this.position+") : "+printPosition();
    }

    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = position;
    }
}
