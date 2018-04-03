import java.util.Scanner;

public class RacingInput {
    public static int readNumCar(){
        System.out.print(messageBeautifier("how many car?"));
        Scanner scanner = new Scanner(System.in);
        int value = scanner.nextInt();
        return value;
    }

    public static int readNumCircuit(){
        System.out.print(messageBeautifier("how many circuit?"));
        Scanner scanner = new Scanner(System.in);
        int value = scanner.nextInt();
        return value;
    }

    private static String messageBeautifier(String message){
        StringBuffer sb = new StringBuffer();
        sb.append("//////////////\n");
        sb.append(message);
        sb.append("\n//////////////");
        return sb.toString();
    }
}
