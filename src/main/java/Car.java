import java.util.Random;

public class Car {
    private int position;
    private String name;

    public Car(String name){
        this.name = name;
        // 생성자. 초기화하는거.
    }
    public void move(int randomNumber){
        if (randomNumber >= 4) {
            position += 1;
        }
    }
    public int getPosition(){
        return position;
    }
    //logic
}