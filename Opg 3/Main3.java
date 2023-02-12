import java.util.ArrayList;

public class Main3 {
    public static void main(String[] args) {

        FastFood cheeseburger = new Burger("Cheeseburger", 69.99, true);
        System.out.println(cheeseburger);

        FastFood chickpeaSmash = new Sandwich("Chickpea Smash", 69.99, true);
        System.out.println(chickpeaSmash);

        FastFood pepperoni = new Pizza("Pizza Pepperoni", 72.99, false);
        System.out.println(pepperoni);

        FastFood[] foods = new FastFood[3];
        foods[0] = cheeseburger;
        foods[1] = chickpeaSmash;
        foods[2] = pepperoni;

        for (int i = 0; i < foods.length; i++) {
            FastFood food = foods[i];
            System.out.println("Food: " + food.getDish() + ". Price: " + food.getPrice() + "kr. As a menu? " + food.asMenu());
        }


    }

}
