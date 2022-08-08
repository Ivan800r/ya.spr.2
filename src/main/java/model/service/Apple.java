package model.service;

import model.constants.Colour;
import model.constants.Discount;

public class Apple extends Food {
    Colour colour;
    public Apple(int amount, double price, boolean isVegetarian, Colour colour) {
        super(amount, price, true);
        this.colour = colour;
    }

    @Override
    public double getDiscount() {
        if (this.colour == Colour.RED) {
            return Discount.SIXTY;
        }
        return Discount.ZERO;
    }
}
