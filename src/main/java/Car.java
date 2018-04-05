public class Car {
    String name;
    int position;
    Car(String name){
        this.name = name;
        this.position = 0;
    }

    public void move(int distance){
        this.position += distance;
    }
}
