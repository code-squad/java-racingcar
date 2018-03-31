package race;

class Car {
    
    private int distance; // 이동거리

    Car() {
        initDistance();
    }

    void move() {
        this.distance++;
    }

    int getCurrentLocation() {
        return distance;
    }

    private void initDistance() {
        this.distance = 0;
    }
}
