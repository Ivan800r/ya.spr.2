package model.service;

public class Apple extends Food {

    private static boolean colour = true;

    public Apple(int amount, double price, boolean colour) {
        super(amount, price, true);
        this.colour = colour;
    }

    @Override
    public double getDiscount() {
        if (colour) {
            return 60;
        }
        return 0;
    }
}
