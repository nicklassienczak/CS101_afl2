public abstract class Computer {

    String opSystem;
    int sizeOfHD;
    int price;

    public Computer (String opSystem, int sizeOfHD, int price) {
        this.opSystem = opSystem;
        this.sizeOfHD = sizeOfHD;
        this.price = price;
    }

    public abstract String showSpecs();
    public abstract String turnDeviceOn();


}
