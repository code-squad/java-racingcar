package racinggame.view;

public class GameResult {

    private String name;
    private int position;

    public GameResult(String name, int position) {
        this.name = name;
        this.position = position;
    }

    String getName() {
        return this.name;
    }

    int getPosition() {
        return this.position;
    }
}
