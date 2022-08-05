package model.service;

public abstract class Food implements Discountable {

    //количество продукта в килограммах
    protected int amount;

    //цена за единицу
    protected double price;

    //флаг, который показывает, вегетарианский ли продукт
    protected boolean isVegetarian;

    public Food(int amount, double price, boolean isVegetarian) {
        this.amount = amount;
        this.price = price;
        this.isVegetarian = isVegetarian;
    }

    public Food(int amount, double price) {
        this.amount = amount;
        this.price = price;
    }

    @Override
    public double getDiscount() {
        return 0;
    }
}
