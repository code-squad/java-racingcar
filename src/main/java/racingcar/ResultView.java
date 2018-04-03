package racingcar;

public class ResultView {

    private static StringBuilder[] carRoutes;
    private static final String ROUTE = "-";

    public static void printCarRoutes(GameResult result) {
        initialCarRoute(result.getCarPostionLength());

        for(int i = 0; i < result.getCarPostionLength(); i++) {
            drawSingleCarRoute(result.getSingleCarPosition(i), i);
        }

        systemOutprintCarRoute();
    }

    private static void initialCarRoute(int carNumber) {
        carRoutes = new StringBuilder[carNumber];
        for(int i = 0; i < carNumber; i++) {
            carRoutes[i] = new StringBuilder();
        }
    }

    private static void drawSingleCarRoute(int carRouteCnt, int carNum) {
        for(int j = 0; j < carRouteCnt; j++) {
            carRoutes[carNum].append(ROUTE);
        }
    }

    private static void systemOutprintCarRoute() {
        for(StringBuilder singleCarRoute: carRoutes) {
            System.out.println(singleCarRoute.toString());
        }
        System.out.println();
    }
}
