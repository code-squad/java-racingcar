package racingcar;

public class RacingCarView {

    private StringBuilder[] carRoutes;
    private final String ROUTE = "-";

    public void printCarRoutes(int[] carPosition) {
        initialCarRoute(carPosition.length);

        for(int i = 0; i < carPosition.length; i++) {
            drawSingleCarRoute(carPosition[i], i);
        }

        systemOutprintCarRoute();
    }

    private void initialCarRoute(int carNumber) {
        carRoutes = new StringBuilder[carNumber];
        for(int i = 0; i < carNumber; i++) {
            carRoutes[i] = new StringBuilder();
        }
    }

    private void drawSingleCarRoute(int carRouteCnt, int carNum) {
        for(int j = 0; j < carRouteCnt; j++) {
            carRoutes[carNum].append(ROUTE);
        }
    }

    private void systemOutprintCarRoute() {
        for(StringBuilder singleCarRoute: carRoutes) {
            System.out.println(singleCarRoute.toString());
        }
        System.out.println();
    }
}
