import java.util.Random;

public class RandomRule extends Rule{
    boolean isActive = true;
    RandomRule(boolean isActive){
        this.isActive = isActive;
    }

    public boolean isValid(){
        if (!this.isActive){
            return true;
        }
        Random r = new Random();
        int chance = r.nextInt(9);
        if (chance >= 4){
            return true;
        }
        return false;
    }
}
