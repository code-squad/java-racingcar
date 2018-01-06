package car;

import java.util.Random;

public class Car {
    private String name;
    private int position = 0;

    public Car(int number){
        name = number + "번 차";
    }

    public void move(){
        int ran = randomInt();
        if(ran >= 4){
            position += 1;
            return;
        }
        position -= 1;
    }

    public int randomInt(){
        Random ran = new Random();
        return ran.nextInt(10);
    }

    public int getPosition() {
        return position;
    }

    @Override
    public String toString(){
        return name;
    }
}
