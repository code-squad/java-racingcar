package racingcar;

public class Car{
    private String name;
    private int position = 0;
    private String randomCount = "";

    public Car(String name) {
        this.name = name;
    }
    public int position() {
        return this.position;
    }
    public String name() {
        return this.name;
    }
    public String randomCount() {
        return this.randomCount;
    }
    public int increasePosition(int i) {
        this.position = i;
        return this.position;
    }

    public void setRandomCount(String randomCount) {
        this.randomCount = randomCount;
    }


}