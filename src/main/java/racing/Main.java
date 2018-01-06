package racing;

public class Main {
    public static void main(String[] args) {
        Race race = new Race();
        System.out.println("자동차 대수는 몇 대 인가요? 1~10 사이의 숫자를 입력해주세요.");
        race.setCarCountByUser();
        System.out.println("시도할 회수는 몇 회 인가요? 1~10 사이의 숫자를 입력해주세요.");
        race.setMoveCountByUser();
        System.out.println(String.format("자동차 대수 : %d, 이동 횟수 : %d", race.getCarCount(), race.getMoveCount()));
    }
}
