package race;

import java.util.Random;

class RaceCar {
    private static final int RANDOM_LIMIT = 9;

    private Recorder recorder;
    private int distance;

    RaceCar() {
        recorder = new Recorder();
        initDistance();
    }

    void move(RaceRule rule) {
        if (rule.canMove(getIntEqualsOrUnderOf(RANDOM_LIMIT))) {
            this.distance++;
        }
        recorder.record(getCurrentLocation());
    }

    Recorder getRecorder() {
        return recorder;
    }

    int getCurrentLocation() {
        return distance;
    }

    private void initDistance() {
        this.distance = 0;
    }

    private int getIntEqualsOrUnderOf(int limit) {
        Random random = new Random();
        return random.nextInt(limit);
    }
}
