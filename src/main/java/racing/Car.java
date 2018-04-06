package racing;

public class Car {
    private StringBuilder location;
    private String name;

    public Car(String name){
        this.name= name;
        location = new StringBuilder();
    }

    public void go(){
        location.append('-');
    }

    public String getLocation(){
        return this.location.toString();
    }

    @Override
    public String toString() {
        return this.name + ": "+ this.location.toString();
    }

    public int getDistance(){
        return this.location.length();
    }

    public String getName(){
        return this.name;
    }

}
