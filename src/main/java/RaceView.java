import java.util.List;

public class RaceView {
    public static void printStatus(List<Car> cars){
        for (Car car : cars){
            System.out.println(CarProfile(car));
        }
        System.out.println();
    }

    public static void printWinner(List<Car> cars){
        for (Car car : cars){
            System.out.print(car.getName());
        }
        System.out.println("최종 우승입니다");
    }

    private static String CarProfile(Car car){
        StringBuffer sb = new StringBuffer();
        sb.append(car.getName());
        sb.append(":");
        sb.append(convertToBar(car.getPosition(), 1));
        return sb.toString();
    }
    private static String convertToBar(int num, int offset){
        StringBuffer sb = new StringBuffer();
        for (int i=0; i<(num + offset); i++){
            sb.append("-");
        }
        return sb.toString();
    }
}

