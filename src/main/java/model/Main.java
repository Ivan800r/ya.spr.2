package model;

import model.constants.Colour;
import model.service.Apple;
import model.service.Food;
import model.service.Meat;
import model.service.ShoppingCart;

public class Main {
    public static void main(String[] args) {
        Colour colour = new Colour();

        Food[] food = {
            new Meat(5, 100, false),
            new Apple(10, 50,true, colour.appleRed),
            new Apple(8, 60,true, colour.appleGreen)
        };

        ShoppingCart shoppingCart = new ShoppingCart(food);
        System.out.println("Общую сумму всех товаров без скидки  - " + shoppingCart.getTotalPrice());
        System.out.println("Сумму скидки для всей корзины  - " + (shoppingCart.getTotalPrice() - shoppingCart.getTotalPriceWithDiscount()));
        System.out.println("Сумму всех вегетарианских продуктов без скидки  - " + shoppingCart.getTotalPriceVegetarianWithoutDiscount());


    }
}
