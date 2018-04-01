package race;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        GameView view = new GameView();
        
        view.askNumberOfCar();
        int cars = scanner.nextInt();
        
        view.askNumberOfLab();
        int labs = scanner.nextInt();
        
        RacingGame game = new RacingGame(generateCarsNumberOf(cars), labs);
        game.race(new DefaultRaceRule());

        List<Recorder> recorders = GameResult
                .getResultByEachLab(game.getRecords(), labs);
        
        Drawer lineDrawer = new LineDrawer();
        lineDrawer.draw(recorders);
    }
    
    private static List<RaceCar> generateCarsNumberOf(int number) {
        List<RaceCar> raceCars = new ArrayList<>();

        for (int i = 0; i < number; i++) {
            raceCars.add(new RaceCar());
        }

        return raceCars;
    }
    

    private static class GameView {
        private static final String RACE_CARS_ASK_MESSAGE = "자동차 대수는 몇 대 인가요?";
        private static final String LABS_ASK_MESSAGE = "시도할 회수는 몇 회 인가요?";
        
        void askNumberOfCar() {
            System.out.println(RACE_CARS_ASK_MESSAGE);
        }

        void askNumberOfLab() {
            System.out.println(LABS_ASK_MESSAGE);
        }
    }
}
