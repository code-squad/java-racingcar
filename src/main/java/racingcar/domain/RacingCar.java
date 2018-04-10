package racingcar.domain;

import racingcar.view.InputView;
import racingcar.view.ResultView;

import java.util.List;

public class RacingCar {

    PlayRounds playRounds;


    public PlayRounds startRacing(UserInput userInput){
        String[] players = userInput.getPlayers();

        PlayRounds playRounds = new PlayRounds(players);
        return playRounds;
    }


}
