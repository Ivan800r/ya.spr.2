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

    @Override
    public double getDiscount() {
        return 0;
    }

    public double getTotalPrice() {
        return amount * price;
    }

    public double getTotalPriceWithDiscount() {
        if (getDiscount() == 0){
            return getTotalPrice();
    }
        return getDiscount()/100*getTotalPrice();
    }

    public double getTotalPriceVegetarian() {
        if (isVegetarian){
            return getTotalPrice();
        }
        return 0;
    }
}
