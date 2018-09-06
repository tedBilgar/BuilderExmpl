package com.company;

import com.company.builder.CakeBuilder;
import com.company.builder.PizzaBuilder;
import com.company.model.Cake;
import com.company.model.Pizza;

public class Main {

    public static void main(String[] args) {
        Pizza pizza = new PizzaBuilder("20","30").setCheese(true).setPepperoni(true).setHelloMessage("New message").build();
        Cake cake = new CakeBuilder("300","25").setMeat(true).build();
        System.out.println(pizza);
        System.out.println(cake);
    }
}
