package race;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

class GameResult {
    private List<RaceCar> raceCars;

    GameResult(List<RaceCar> raceCars) {
        this.raceCars = raceCars;
    }

    List<String> getWinnerNames() {
        return getWinners().stream()
                .map(RaceCar::getRacerName)
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

