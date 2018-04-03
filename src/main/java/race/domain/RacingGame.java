package race.domain;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class RacingGame {
    private List<RaceCar> raceCars;
    private int labs;

    public RacingGame(String[] names, int labs) {
        this.raceCars = setStartLine(names);
        this.labs = labs;
    }

    public void race(RaceRule rule) {
        for (int i = 0; i < labs; i++) {
            raceCars.forEach(c -> c.move(rule));
        }
    }

    public List<RaceCar> getParticipants() {
        return raceCars;
    }

    private List<RaceCar> setStartLine(String[] names) {
        if (isEmpty(names)) {
            throw new IllegalArgumentException("레이스 참여자가 아무도 없습니다.");
        }

        List<RaceCar> raceCars = new ArrayList<>(names.length);
        IntStream.range(0, names.length).forEach(idx ->
                raceCars.add(new RaceCar(names[idx].trim())));

        return raceCars;
    }

    private boolean isEmpty(String[] names) {
        return names == null || names.length == 0;
    }
}