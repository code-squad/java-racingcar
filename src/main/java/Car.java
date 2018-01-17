import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Car {
    private static final Logger logger = LoggerFactory.getLogger(Car.class);
    private int position;
    private String name;

    public Car(String name){
        this.name = name;
    }

    public Car(String name,int position){
        this.name = name;
        this.position = position;
    }

    public int move(int randomNumber){
        if (randomNumber >= 4) {
            position += 1;
           // logger.info("{} move", name);
//            logger.info("current position is {}", position);

        }
        return position;
    }
    public int getPosition(){
        return position;
    }

    public String getName(){
        return name;
    }

    public boolean matchPosition(int position){
        return this.position == position;
    }

    public void setPosition(int i){
        position = i;
    }
}