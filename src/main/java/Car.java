public class Car {

    private int position;
    private String name;

    public Car(String name) {
        this.position = 0;
        this.name = name.trim();
    }

    public int move(int rand) {
        if (rand >= 4) {
            ++position;
        }

        return position;
    }

    public int getPosition() {
        return position;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(getName());
        stringBuilder.append(" : ");

        for (int i = 0; i < position; i++) {
            stringBuilder.append("-");
        }

        return stringBuilder.toString();
    }

}
