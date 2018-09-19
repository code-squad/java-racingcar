import java.util.Scanner;

public class ArrayTest {
    public static void main(String[] args) {
        String[] n = name();
        cars(n);
    }
    public static String[] name(){
        System.out.println("input cars name! ( use ',' when you want seperate.)");
        Scanner scanner = new Scanner(System.in);
        String carName = scanner.nextLine();
        String[] nameSep = carName.split(",");
        return nameSep;
    }

    public static int cars(String[] name) {
        int carNum = name.length;
        return carNum;
    }
}
