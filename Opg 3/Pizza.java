public class Pizza implements FastFood {

    private String typeOfPizza;
    private double price;
    private boolean asMenu;

    public Pizza(String typeOfPizza, double price, boolean asMenu) {
        this.typeOfPizza = typeOfPizza;
        this.price = price;
        this.asMenu = asMenu;
        if (asMenu == true) {
            asMenu();
        }
    }

    @Override
    public String getDish() {
        return typeOfPizza;
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
        return "Pizza{" +
                "typeOfPizza='" + typeOfPizza + '\'' +
                ", price=" + price +
                ", asMenu=" + asMenu +
                '}';
    }
}
