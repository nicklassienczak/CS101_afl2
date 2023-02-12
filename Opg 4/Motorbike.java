public class Motorbike implements Vehicle{

    private String modelName;
    private int gear;
    private int speed;


    public Motorbike(String modelName, int gear, int speed) {
        this.modelName = modelName;
        this.gear = gear;
        this.speed = speed;
    }

    @Override
    public void changeGear(int newGear) {
        gear = newGear;
    }

    @Override
    public void speedUp(int increase) {
        speed += increase;
    }

    @Override
    public void applyBrakes(int decrease) {
        speed -= decrease;
    }

    @Override
    public String toString() {
        return "Motorbike{" +
                "modelName='" + modelName + '\'' +
                ", gear=" + gear +
                ", speed=" + speed +
                '}';
    }
}
