package racingcar;

public class PlayerCar {
    private String position = "-";

    public void moveCar(int condition){
        if(condition >= 4)
            position += "-";
    }

    public String getCarPosition(){
        return position;
    }

    public void printCarPosition(){
        System.out.println(position);
    }
}
