package game.racingGame;

import lombok.Data;

@Data
public class Car{

    private int position;

    Car() {
        this.position = 0;
    }

    public void move(int value){
        if(value > 4){
            position += 1;
        }
    }
}
