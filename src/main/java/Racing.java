import java.util.Random;

public class Racing {
    private int numCar = 0;
    private int numCircuit = 0;
    private int[] carPositions;


    public void setNumCar(int numCar){
        this.carPositions = new int[numCar];
        this.numCar = numCar;
    }

    public void setNumCircuit(int numCircuit){
        this.numCircuit = numCircuit;
    }

    public int getNumCar(){
        return this.numCar;
    }

    public int getNumCircuit(){
        return this.numCircuit;
    }

    public int[] getCarPositions(){
        return this.carPositions;
    }

    public void start(){
        for (int i =0; i<this.numCircuit; i++){
            update(move());
            printStatus();
        }
    }

    public int[] move() {
        int[] result = new int[this.numCar];
        for (int i=0; i<this.numCar; i++){
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

    public void update(int[] currentCircuit){
        for (int i=0; i<this.numCar; i++){
            this.carPositions[i] += currentCircuit[i];
        }
    }

    public void printStatus(){
        for (int i =0; i<this.numCar; i++){
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
