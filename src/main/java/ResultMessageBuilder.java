public class ResultMessageBuilder {

    public static String build(int[] carsPosition){
        StringBuilder builder = new StringBuilder();
        for (int carPos : carsPosition) {
            builder.append(convertMessage(carPos))
                    .append("\n");
        }

        return builder.toString();
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
