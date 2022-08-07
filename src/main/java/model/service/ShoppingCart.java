package model.service;

public class ShoppingCart {
    private final Food[] food;

    public ShoppingCart(Food[] food) {
        this.food = food;
    }

    public double getTotalPrice() {
        double totalPrice = 0;
        for (int i = 0; i < food.length; i++) {
            totalPrice = totalPrice + food[i].getTotalPrice();
        }
        return 0;
    }

    public double getTotalPriceWithDiscount() {
        return 0;
    }

    public double getTotalPriceVegetarian() {
        return 0;
    }
}
