package racing;

public class Car {
    private static int RACING_NUM_DETERMINE = 1;
    private StringBuilder location;
    private final int number; // 추후에 필요할 수 있을 것 같아 임시로 만들어둠


    public Car(){
        this(RACING_NUM_DETERMINE++);
    }

    private Car(int number){
        this.number = number;
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
        return this.location.toString();
    }
}
