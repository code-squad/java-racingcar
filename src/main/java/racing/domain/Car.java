package racing.domain;

public class Car {
    private String name;
    private int position;

    public Car(String name){
        this.name= name;
        this.position = 0;
    }

    public void move(int num){
        if(num > 4)
            this.position++;
    }


    public int getDistance(){
        return this.position;
    }

    public String getName(){
        return this.name;
    }

    public boolean matchDistance(int bestDistance) {
        return this.position == bestDistance;
    }
}
