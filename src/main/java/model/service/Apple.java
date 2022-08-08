package model.service;

import model.constants.Colour;

public class Apple extends Food {
    Colour colour;
    public Apple(int amount, double price, Colour colour) {
        super(amount, price, true);
        this.colour = colour;
    }

    @Override
    public double getDiscount() {
        if (colour == Colour.RED) {
            return 60;
        }
        return 0;
    }
}
