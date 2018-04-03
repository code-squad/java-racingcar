package race.domain;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class GameResult {
    private List<RaceCar> raceCars;

    public GameResult(List<RaceCar> raceCars) {
        this.raceCars = raceCars;
    }

    public List<String> getWinnerNames() {
        return getWinners().stream()
                .map(RaceCar::getRacer)
                .collect(Collectors.toList());
    }
    
    private List<RaceCar> getWinners() {
        return getNamesByResult(getBestResult());
    }

    private int getBestResult() {
        return raceCars.stream()
                .map(RaceCar::getRecorder)
                .map(Recorder::getLastRecord)
                .max(Comparator.naturalOrder())
                .get();
    }

    private List<RaceCar> getNamesByResult(int result) {
        return raceCars.stream()
                .filter(c -> c.getRecorder().getLastRecord() == result)
                .collect(Collectors.toList());
    }
}

