package racingcar;

public class UserInput {
    private int carCount;
    private int roundCount;

    public UserInput(){

    }

    public UserInput(String carCount, String roundCount){
        isValidParameter(carCount, roundCount);

        this.carCount = Integer.parseInt(carCount);
        this.roundCount = Integer.parseInt(roundCount);
    }

    public void isValidParameter(String carCount, String roundCount){
        if(carCount == null || carCount.trim().isEmpty() || Integer.parseInt(carCount) < 1) {
            throw new IllegalArgumentException();
        }

        if(roundCount == null || roundCount.trim().isEmpty() || Integer.parseInt(roundCount) < 1) {
            throw new IllegalArgumentException();
        }
    }


    public int getCarCount() {
        return carCount;
    }

    public void setCarCount(int carCount) {
        this.carCount = carCount;
    }

    public int getRoundCount() {
        return roundCount;
    }

    public void setRoundCount(int roundCount) {
        this.roundCount = roundCount;
    }
}
