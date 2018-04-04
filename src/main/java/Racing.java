import java.util.List;
import java.util.Random;

public class Racing {
    private int numCircuit;
    private int[] carPositions;

    public Racing(int numCar, int numCircuit){
        this.carPositions = new int[numCar];
        this.numCircuit = numCircuit;
    }
    public int[] move(Rule rule) {
        int numCar = this.carPositions.length;
        int[] result = new int[numCar];
        for (int i=0; i<numCar; i++){
            result[i] = movingDistance(rule);
        }
        return update(result);
    }
    public int movingDistance(Rule rule){
        if(rule.isValid()){
            return 1;
        }
        return 0;
    }
    public int[] update(int[] currentCircuit){
        int numCar = this.carPositions.length;
        for (int i=0; i<numCar; i++){
            this.carPositions[i] += currentCircuit[i];
        }
        return this.carPositions;
    }
}
