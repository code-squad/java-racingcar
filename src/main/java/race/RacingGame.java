package race;

import java.util.List;
import java.util.stream.Collectors;

class RacingGame {
    private List<RaceCar> raceCars;
    private int labs;

    RacingGame(List<RaceCar> raceCars, int labs) {
        setCars(raceCars);
        this.labs = labs;
    }

    void race(RaceRule rule) {
        for (int i = 0; i < labs; i++) {
            raceCars.forEach(c -> c.move(rule));
        }
    }

    List<Recorder> getRecords() {
        return raceCars.stream()
                .map(RaceCar::getRecorder)
                .collect(Collectors.toList());
    }

    private void setCars(List<RaceCar> raceCars) {
        if (raceCars == null || raceCars.size() == 0) {
            throw new IllegalArgumentException();
        }
        
        this.raceCars = raceCars;
    }
}

