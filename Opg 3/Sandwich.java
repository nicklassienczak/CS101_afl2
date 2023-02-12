public class Sandwich implements FastFood {

    private String typeOfSandwich;
    private double price;
    private boolean asMenu;

    public Sandwich(String typeOfSandwich, double price, boolean asMenu) {
        this.typeOfSandwich = typeOfSandwich;
        this.price = price;
        this.asMenu = asMenu;
        if (asMenu == true) {
            asMenu();
        }
    }

    @Override
    public String getDish() {
        return typeOfSandwich;
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
        return "Sandwich{" +
                "typeOfSandwich='" + typeOfSandwich + '\'' +
                ", price=" + price +
                ", asMenu=" + asMenu +
                '}';
    }
}

