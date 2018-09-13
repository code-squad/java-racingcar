import java.util.Random;

public class ArrayTest {
    public static void main(String[] args) {
        int[] arr = new int[10];
        int[] code = {2, 5, 7, 8, 0};
        for (int i = 0; i < arr.length; i++) {
            Random random = new Random();
            int tmp = (int) (Math.random() * code.length);
            arr[i] = code[tmp];
            System.out.print(arr[i] + ",");
        }
    }

    public static void playGame(int carN, int move, int ran) {
        int[] cars = new int[3];
        int[] randomNum = new int[12];
        randomNum[12] = ran;
        System.out.println("실행결과");
        for(int i = 0; i < carN ; i++) {
            cars[i] = randomNum[carN * move];
            for(int j = 0; j < move; j++) {
                if(ran >= 4) {
                    System.out.print("-");
                } else {
                    System.out.print("1");
                }
            }
            System.out.println("");
        }
    }
}
