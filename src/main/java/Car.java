public class Car {
    private String name;
    private int position;
    Car(String name){
        this.name = name;
        this.position = 0;
    }
    public void move(int randomValue){
        if(randomValue >= 4 ){
            this.position++;
        }
    }

    public int getPosition(){
        return this.position;
    }
    public String getName(){
        return this.name;
    }


}
