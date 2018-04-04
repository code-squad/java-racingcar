package racing.player;

public class Car {
    public int position;
    public String distance = "";
    public String name;

    public Car(String name) {
        this.name = name;
    }

    public void setPosition(int position) {
        this.position = position;
        setDistance(position);
    }

    private void setDistance(int position) {
        String distance = "";
        for (; position > 0; position--) {
            distance = distance.concat("-");
        }
        this.distance = distance;
    }
}
