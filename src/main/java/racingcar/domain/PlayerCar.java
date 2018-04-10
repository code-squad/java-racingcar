package racingcar.domain;

public class PlayerCar {
    static final int MOVE_MIN_VALUE = 4;

    private String carName = "";
    private String position = "-";

    public PlayerCar(String carName){
        this.carName = carName;
    }

    public void moveCar(int condition){
        if(condition >= MOVE_MIN_VALUE)
            position += "-";
    }

    public String getPosition(){
        return position;
    }
    public String getCarName() { return carName;}

    public boolean isBiggerThenPosition(int otherPosition){
        if(position.length() > otherPosition) {
            return true;
        }
        return false;
    }

    public boolean isEqualThenPosition(int otherPosition){
        if(position.length() == otherPosition) {
            return true;
        }
        return false;
    }

    void setCarPosition(String carPosition){ this.position = carPosition;}

}
