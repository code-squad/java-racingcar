package racingcar;

public class Car {

    private String name;
    private int position = 0;
    public static Car[] carList = new Car[0];

    Car(){
        setCarLists();
    }

    public Car(String name, int position) {
        this.name = name;
        this.position = position;
    }

    public void setCarLists() {
        carList = new Car[Process.cars.length];
        for(int i = 0; i < carList.length; i++) {
            Car car = new Car(Process.cars[i], Process.carPositions[i]);
            carList[i] = car;
        }
    }
}