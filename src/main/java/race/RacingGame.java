package race;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

class RacingGame {
    private List<RaceCar> raceCars;
    private int labs;

    RacingGame(String[] names, int labs) {
        this.raceCars = setStartLine(names);
        this.labs = labs;
    }

    void race(RaceRule rule) {
        for (int i = 0; i < labs; i++) {
            raceCars.forEach(c -> c.move(rule));
        }
    }

    Map<String, Recorder> getRecords() {
        return raceCars.stream().collect(Collectors.toMap(
                RaceCar::getRacerName,
                RaceCar::getRecorder)
        );
    }

    private List<RaceCar> setStartLine(String[] names) {
        if (names == null || names.length == 0) {
            throw new IllegalArgumentException("레이스 참여자가 아무도 없습니다.");
        }

        List<RaceCar> raceCars = new ArrayList<>(names.length);
        IntStream.range(0, names.length).forEach(idx ->
                raceCars.add(new RaceCar(names[idx].trim())));

        return raceCars;
    }
}