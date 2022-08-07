package model.service;

public class ShoppingCart {
    private final Food[] food;

    public ShoppingCart(Food[] food) {
        this.food = food;
    }

    public double getTotalPrice() {
        return 0;
    }

    public double getTotalPriceWithDiscount() {
        return 0;
    }

    public double getTotalPriceVegetarian() {
        return 0;
    }
}
