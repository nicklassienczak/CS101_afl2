public class Main4 {
    public static void main(String[] args) {

        Motorbike yamaha = new Motorbike("Yamaha MT-125", 3, 80);
        System.out.println(yamaha);
        yamaha.speedUp(100);
        yamaha.changeGear(6);
        yamaha.applyBrakes(180);
        System.out.println(yamaha);

        Motorbike kawasaki = new Motorbike("Kawasaki Ninja H2", 0, 0);
        System.out.println(kawasaki);
        kawasaki.changeGear(6);
        kawasaki.speedUp(280);
        System.out.println(kawasaki);

    }
}
