package racingcar;

public class PlayerCar {
    private String position = "-";
    static final int MOVE_MIN_VALUE = 4;

    public void moveCar(int condition){
        if(condition >= MOVE_MIN_VALUE)
            position += "-";
    }

    public String getCarPosition(){
        return position;
    }

}
