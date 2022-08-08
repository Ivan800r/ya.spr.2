package model.service;

import model.constants.Discount;

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
        return totalPrice;
    }

    public double getTotalPriceWithDiscount() {
        double totalPriceWithDiscount = 0;
        for (int i = 0; i < food.length; i++) {
            totalPriceWithDiscount = totalPriceWithDiscount + food[i].getTotalPriceWithDiscount();
        }
        return totalPriceWithDiscount;
    }

    public double getTotalPriceVegetarianWithoutDiscount() {
        double totalPriceVegetarian = 0;
        for (int i = 0; i < food.length; i++) {
            totalPriceVegetarian = totalPriceVegetarian + food[i].getTotalPriceVegetarianWithoutDiscount();
        }
        return totalPriceVegetarian;
    }
}