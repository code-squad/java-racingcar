package race;

import java.util.List;

// FIXME 이름이 적당하지 않음. Drawer 는 사전상 의미로 서랍임.
interface Drawer {
    void draw(List<Car> cars);
}

class LineDrawer implements Drawer {
    private String format = "-";

    @Override
    public void draw(List<Car> cars) {
        for (Car car : cars) {
            for (int i = 0; i < car.getCurrentLocation(); i++) {
                System.out.print(format);
            }
            changeLine();
        }
        changeLine();
    }

    private void changeLine() {
        System.out.println();
    }
}
