package com.anu.designpatterns.builder;

public class Main {
    public static void main(String[] args) {
        Pizza pizza = new Pizza();
        pizza.addToppings(Pizza.Toppings.VEGETABLES)
                .addToppings(Pizza.Toppings.TOMATO_SAUCE)
                .addToppings(Pizza.Toppings.JALAPENO)
                .addToppings(Pizza.Toppings.CHICKEN);
        System.out.println(pizza.totalPrice());
    }
}
