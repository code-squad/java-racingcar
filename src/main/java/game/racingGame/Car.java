package game.racingGame;

import lombok.Getter;

@Getter
public class Car{

    private String name;
    private int position;

    Car(String name) {
        this.name = name;
        this.position = 0;
    }

    public int move(int value){
        if(value >= 4){
            position ++;
        }
        return position;
    }
}
