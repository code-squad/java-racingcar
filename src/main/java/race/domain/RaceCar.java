package race.domain;

import java.util.Random;

public class RaceCar {
    private static final int RANDOM_LIMIT = 9;

    private String racer;
    private Recorder recorder;

    public RaceCar(String racer) {
        this.racer = racer;
        recorder = new Recorder();
    }

    public void move(RaceRule rule) {
        int currentLocation = recorder.getLastRecord();
        
        if (rule.canMove(getRandomInt())) {
            currentLocation++;
        }
        
        recorder.record(currentLocation);
    }

    public Recorder getRecorder() {
        return recorder;
    }

    public String getRacer() {
        return racer;
    }

    private int getRandomInt() {
        Random random = new Random();
        return random.nextInt(RANDOM_LIMIT);
    }
}
