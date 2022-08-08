package model.service;

import model.constants.Colour;

public abstract class Food implements Discountable {

    Colour colour;
    //количество продукта в килограммах
    protected int amount;

    //цена за единицу
    protected double price;

    //флаг, который показывает, вегетарианский ли продукт
    protected boolean isVegetarian;

    public Food(int amount, double price) {
        this.amount = amount;
        this.price = price;
    }

    public Food(int amount, double price, boolean isVegetarian, Colour colour) {
        this.amount = amount;
        this.price = price;
        this.isVegetarian = isVegetarian;
        this.colour = colour;
    }

    public Food(int amount, double price, boolean isVegetarian) {
        this.amount = amount;
        this.price = price;
        this.isVegetarian = isVegetarian;
    }


    public double getTotalPrice() {
        return amount * price;
    }

    public double getTotalPriceWithDiscount() {
        if (getDiscount() == 0){
            return getTotalPrice();
    }
        return getDiscount()/100 * getTotalPrice();
    }

    public double getTotalPriceVegetarian() {
        if (isVegetarian){
            return getTotalPrice();
        }
        return 0;
    }
}
