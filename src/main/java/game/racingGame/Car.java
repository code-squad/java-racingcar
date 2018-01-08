package game.racingGame;

import lombok.Getter;

@Getter
public class Car{

    private int position;

    Car() {
        this.position = 0;
    }

    public int move(int value){
        if(value >= 4){
            position ++;
        }
        return position;
    }
}
