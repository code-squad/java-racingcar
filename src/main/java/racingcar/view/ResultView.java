package racingcar.view;

import racingcar.domain.Car;
import racingcar.domain.GameResult;

public class ResultView {

    private static StringBuilder[] carRoutes;
    private static final String ROUTE = "-";

    public static void printCarRoutes(GameResult result) {
        initialCarRoute(result.getCarPostionLength());
        for(int i = 0; i < result.getCarPostionLength(); i++) {
            drawSingleCarRoute(result.getSingleCarPosition(i), i, result.getSingleCarName(i));
        }
        systemOutprintCarRoute();
    }

    public static void printWinnerCarRacing(GameResult result) {
        StringBuilder sb = new StringBuilder();
        boolean isFirst = true;

        for(Car car: result.getWinnerList()) {
            if(isFirst) {
                sb.append(car.getCarName());
                isFirst = false;
                continue;
            }

            sb.append(", ").append(car.getCarName());
        }
        sb.append("가 최종 우승했습니다.");

        System.out.println(sb.toString());
    }

    private static void initialCarRoute(int carNumber) {
        carRoutes = new StringBuilder[carNumber];
        for(int i = 0; i < carNumber; i++) {
            carRoutes[i] = new StringBuilder();
        }
    }

    private static void drawSingleCarRoute(int carRouteCnt, int carNum, String carName) {
        carRoutes[carNum].append(carName).append(" : ");
        for(int j = 0; j < carRouteCnt; j++) {
            carRoutes[carNum].append(ROUTE);
        }
    }

    private static void systemOutprintCarRoute() {
        for(StringBuilder singleCarRoute:carRoutes) {
            System.out.println(singleCarRoute.toString());
        }
        System.out.println();
    }
}
