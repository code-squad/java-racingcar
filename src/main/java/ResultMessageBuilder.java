import java.util.ArrayList;
import java.util.Collections;

public class ResultMessageBuilder {

    public static String build(ArrayList<Car> carList){
        return buildResultMessage(carList) + getWinnerNames(carList);
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

    private static String getWinnerNames(ArrayList<Car> carList){
        if(!isExistListItem(carList)){
            return "없음";
        }
        recordSort(carList);
        int winnerRecord = carList.get(0).getCarPos();
        return buildWinnerNames(searchWinner(carList, winnerRecord));
    }

    private static String buildWinnerNames(String[] winnerNameArr){
        StringBuilder builder = new StringBuilder();
        for(int i=0; i<winnerNameArr.length; i++){
            builder.append(winnerNameArr[i]);

            if(isExistArrNext(winnerNameArr, i)){
                builder.append(", ");
            }
        }
        builder.append("가 최종 우승했습니다.");
        return builder.toString();
    }

    private static boolean isExistArrNext(String[] strArr, int currentIdx){
        return currentIdx < strArr.length-1;
    }

    private static String[] searchWinner(ArrayList<Car> carList, int winnerRecord){
        ArrayList<String> winnerNames = new ArrayList<>();
        for(Car car : carList){
            if(car.getCarPos() < winnerRecord){
                break;
            }
            winnerNames.add(car.getName());
        }
        return convertToArr(winnerNames);
    }

    private static String[] convertToArr(ArrayList<String> strList){
        String[] strArr = new String[strList.size()];
        return strList.toArray(strArr);
    }

    private static void recordSort(ArrayList<Car> carList){
        Collections.sort(carList);
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