package racingcar;

public class PlayerCar {
    private String carName = "";
    private String position = "-";
    static final int MOVE_MIN_VALUE = 4;

    public PlayerCar(){};

    public PlayerCar(String carName){
        this.carName = carName;
    }

    public void moveCar(int condition){
        if(condition >= MOVE_MIN_VALUE)
            position += "-";
    }

    public String getCarPosition(){
        return position;
    }
    public String getCarName() { return carName;}

    public void setCarPosition(String carPosition){ this.position = carPosition;}
    public void setCarName(String carName){this.carName = carName;}

}
