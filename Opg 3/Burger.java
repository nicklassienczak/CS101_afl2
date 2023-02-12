public class Burger implements FastFood {

    public String typeOfBurger;
    public double price;
    public boolean asMenu;

    public Burger(String typeOfBurger, double price, boolean asMenu) {
        this.typeOfBurger = typeOfBurger;
        this.price = price;
        this.asMenu = asMenu;
        if (asMenu == true) {
            asMenu();
        }
    }



    @Override
    public String getDish() {
        return typeOfBurger;
    }

    @Override
    public Double getPrice() {
        return price;
    }

    @Override
    public boolean asMenu() {
        price = (price + 40);
        return asMenu;
    }

    @Override
    public String toString() {
        return "Burger{" +
                "typeOfBurger='" + typeOfBurger + '\'' +
                ", price=" + price +
                ", asMenu=" + asMenu +
                '}';
    }
}
