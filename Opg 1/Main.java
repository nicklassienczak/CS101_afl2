public class Main {
    public static void main(String[] args) {

        Laptop thinkPad = new Laptop("ThinkPad E15", "Windows", 256, 6999);
        System.out.println(thinkPad.turnDeviceOn());
        System.out.println(thinkPad.showSpecs());
        System.out.println(thinkPad.launchVideoGame());

        Laptop macbookPro = new Laptop("Macbook Pro 2022", "Mac OS", 256, 13999);
        System.out.println(macbookPro.turnDeviceOn());
        System.out.println(macbookPro.showSpecs());
        System.out.println(macbookPro.launchVideoGame());

        Smartphone iPhone = new Smartphone("iPhone 14", "iOS", 128, 8999);
        System.out.println(iPhone.turnDeviceOn());
        System.out.println(iPhone.showSpecs());
        System.out.println(iPhone.expensiveOrNot());



    }
}
