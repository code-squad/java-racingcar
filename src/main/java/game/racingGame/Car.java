package game.racingGame;

import lombok.Getter;

@Getter
public class Car{

    private String name;
    private Integer position;

    Car(String name) {
        this.name = name;
        this.position = 0;
    }

    Car(String name, Integer position){
        this.name = name;
        this.position = position;
    }

    public int move(int value){
        if(value >= 4){
            position ++;
        }
        return position;
    }
}
