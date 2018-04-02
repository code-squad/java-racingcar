package race;

import java.util.Random;

class RaceCar {
    private static final int RANDOM_LIMIT = 9;

    private String racer;
    private Recorder recorder;

    RaceCar(String racer) {
        this.racer = racer;
        recorder = new Recorder();
    }

    void move(RaceRule rule) {
        int currentLocation = recorder.getLastRecord();
        
        if (rule.canMove(getIntEqualsOrUnderOf(RANDOM_LIMIT))) {
            currentLocation++;
        }
        
        recorder.record(currentLocation);
    }

    Recorder getRecorder() {
        return recorder;
    }

    String getRacerName() {
        return racer;
    }

    private int getIntEqualsOrUnderOf(int limit) {
        Random random = new Random();
        return random.nextInt(limit);
    }
}
