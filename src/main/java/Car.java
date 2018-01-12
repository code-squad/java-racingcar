import java.util.Random;

public class Car {
    private int position;
    public void move(int randomNumber){
        if (randomNumber >= 4) {
            position += 1;
        }
    }

    public int getPosition(){
        return position;
    }
}