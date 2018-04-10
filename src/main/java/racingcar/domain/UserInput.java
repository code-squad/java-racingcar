package racingcar.domain;

public class UserInput {
    private String[] players;
    private int roundCount;

    public UserInput(){

    }

    public UserInput(String players, String roundCount){
        isValidParameter(players, roundCount);

        this.players = players.split(",");
        this.roundCount = Integer.parseInt(roundCount);
    }

    public void isValidParameter(String payers, String roundCount){
        if(payers == null || payers.isEmpty()) {
            throw new IllegalArgumentException();
        }

        if(roundCount == null || roundCount.trim().isEmpty() || Integer.parseInt(roundCount) < 1) {
            throw new IllegalArgumentException();
        }
    }


    public String[] getPlayers() {
        return players;
    }

    public void setPlayers(String[] payers) {
        this.players = payers;
    }

    public int getRoundCount() {
        return roundCount;
    }

    public void setRoundCount(int roundCount) {
        this.roundCount = roundCount;
    }
}
