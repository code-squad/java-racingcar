import java.util.Scanner;

public class RaceInput {
    public static String[] setCarNames(){
        System.out.print("경주할 자동차 이름을 입력하세요(이름은 쉼표(,)를 기준으로 구분).");
        Scanner scanner = new Scanner(System.in);
        String inputName = scanner.nextLine();
        String[] names = inputName.split(",");
        return names;
    }

    public static int readNumCircuit(){
        System.out.print("몇 바퀴를 도나요?:");
        Scanner scanner = new Scanner(System.in);
        int value = scanner.nextInt();
        return value;
    }


}
