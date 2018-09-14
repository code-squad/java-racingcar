package racingcar;

public class OutputValue {
    public static void displayGame(Car[] cars) {
        System.out.println("실행 결과");
        // getter로 안받고 car에서 출력시킴
        for (int i = 0; i < cars.length; i++) {
            cars[i].printCarName();
            System.out.print(" : ");
            cars[i].drawDash();
        }
    }
    public static void displayWinners(String[] winners) {
        System.out.print("우승자는: " + String.join(",",winners));
    }


}