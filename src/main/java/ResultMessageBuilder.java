import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.stream.Collectors;

public class ResultMessageBuilder {

    public static String build(ArrayList<Car> carList){
        return buildResultMessage(carList) + buildWinnerNameMessage(carList);
    }

    private static String buildResultMessage(ArrayList<Car> carList){
        StringBuilder builder = new StringBuilder();
        for(Car car : carList){
            builder.append(car.getName())
                    .append(" : ")
                    .append(convertMessage(car.getCarPos()))
                    .append("\n");
        }
        return builder.toString();
    }

    private static String buildWinnerNameMessage(ArrayList<Car> carList){
        String message = "(이)가 최종 우승했습니다.";
        return getWinnersName(carList) + message;
    }

    private static String getWinnersName(ArrayList<Car> carList){
        if(!isExistListItem(carList)){
            return "없음";
        }
        int winnerRecord = getWinnerRecord(carList);
        Car[] winners = searchWinners(carList, winnerRecord);
        return Arrays.stream(winners)
                     .filter(car -> car.getCarPos() == winnerRecord)
                     .map(Car::getName)
                     .collect(Collectors.joining(", "));
    }

    public static int getWinnerRecord(ArrayList<Car> carList){
        Car topRecordCar = getTopRecordCar(carList);
        return topRecordCar.getCarPos();
    }

    private static Car getTopRecordCar(ArrayList<Car> carList){
        recordSort(carList);
        return carList.get(0);
    }

    private static void recordSort(ArrayList<Car> carList){
        Collections.sort(carList);
    }

    public static Car[] searchWinners(ArrayList<Car> carList, int winnerRecord){
        return carList.stream()
                      .filter(car -> car.getCarPos() == winnerRecord)
                      .toArray(Car[]::new);
    }

    private static boolean isExistListItem(ArrayList<?> list){
        return list.size() > 0;
    }

    private static String convertMessage(int carPos){
        char message = '-';
        StringBuilder builder = new StringBuilder();
        for(int i=0; i<carPos; i++){
            builder.append(message);
        }
        return builder.toString();
    }
}