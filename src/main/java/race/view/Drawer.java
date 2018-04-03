package race.view;

import race.domain.RaceCar;

import java.util.List;

public interface Drawer {
    void draw(List<RaceCar> records, int labs);
}