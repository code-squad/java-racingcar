import java.util.Random;

public class Racing {

    private int numCircuit = 0;
    private int[] carPositions;

    public Racing(int numCar, int numCircuit){
        this.carPositions = new int[numCar];
    }
    public int getNumCar(){
        return this.carPositions.length;
    }
    public int getNumCircuit(){
        return this.numCircuit;
    }
    public void start(){
        for (int i =0; i<this.numCircuit; i++){
            update(move());
        }
    }
    public int[] move() {
        int numCar = this.carPositions.length;
        int[] result = new int[numCar];
        for (int i=0; i<numCar; i++){
            result[i] = movingDistance();
        }
        return result;
    }
    public int movingDistance(){
        Random r = new Random();
        int chance = r.nextInt(9);
        if (chance >= 4){
            return 1;
        }
        return 0;
    }
    //TODO: 누적 결과도 저장
    public void update(int[] currentCircuit){
        int numCar = this.carPositions.length;
        for (int i=0; i<numCar; i++){
            this.carPositions[i] += currentCircuit[i];
        }
    }
    public void printStatus(){
        int numCar = this.carPositions.length;
        for (int i =0; i<numCar; i++){
            System.out.println(convertToBar(this.carPositions[i], 1));
        }
        System.out.print("\n");
    }
    public String convertToBar(int num, int offset){
        StringBuffer sb = new StringBuffer();
        for (int i=0; i<(num + offset); i++){
            sb.append("-");
        }
        return sb.toString();
    }
}
