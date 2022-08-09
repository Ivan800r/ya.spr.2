package model.service;
import model.constants.Discount;

public class Apple extends Food {
    private String appleRed;

    public Apple(int amount, double price, boolean isVegetarian, String red) {
        super(amount, price, true);
        this.appleRed = red;
    }

    @Override
    public double getDiscount() {
        if (this.appleRed == colour.appleRed) {
            return Discount.SIXTY;
        }
        return Discount.ZERO;
    }
}
