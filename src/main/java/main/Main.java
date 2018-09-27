package main;

import car.GameInfo;
import view.InputView;
import view.ResultView;

public class Main {

    public static void main(String[] args) {
        String names = InputView.name();
        int move = InputView.carMove();

        GameInfo game = new GameInfo(names);
        game.play(move);

        ResultView.totalPrint(game);
    }
}

