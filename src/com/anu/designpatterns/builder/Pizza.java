package com.anu.designpatterns.builder;

import java.util.ArrayList;

class Pizza {

    private final Topping toppings;

    enum Toppings {
        VEGETABLES(20),
        JALAPENO(10),
        CHICKEN(10),
        TOMATO_SAUCE(5);

        private final int price;

        Toppings(int price) {
            this.price = price;
        }
    }

    private int basePrice;

    Pizza() {
        this.basePrice = 100;
        this.toppings = new Topping();
    }

    private static class Topping {
        private ArrayList<Toppings> toppings;

        Topping() {
            this.toppings = new ArrayList<>();
        }

        void add(Toppings topping) {
            this.toppings.add(topping);
        }

        int getTotal() {
            int price = 0;
            for (Toppings topping : toppings) {
               price += topping.price;
            }
            return price;
        }
    }

    Pizza addToppings(Toppings topping) {
        this.toppings.add(topping);
        return this;
    }

    int totalPrice() {
        return this.basePrice + toppings.getTotal();
    }
}

