public class Laptop extends Computer {

    String modelName;

    public Laptop(String modelName, String opSystem, int sizeOfHD, int price) {
        super(opSystem, sizeOfHD, price);
        this.modelName = modelName;
    }

    public String launchVideoGame() {
        return "Launching your favourite video game. GLHF!";
    }


    @Override
    public String showSpecs() {
        String specDetails = "The operating system of your " + modelName + " is " + opSystem + ". The size of your hard-drive is " + sizeOfHD + " GB.";
        if (price > 10000) {
            return specDetails + " \nYour device was quite expensive. Nice gear.";
        } else {
            return specDetails + " \nYou got that on sale? Nice deal buddy!";
        }
    }

    @Override
    public String turnDeviceOn() {
           if (opSystem == "Mac OS") {
               return "*DOOOOONG* startup sound";
           } else {
               return "Booting up";
           }
    }
}
