package com.company.builder;

import com.company.model.Eating;

public class Director {

    public Eating buildCake(){
        return new CakeBuilder("20","123").setMeat(false).setCherry(true).build();
    }

    public Eating buildPizza(){
        return new PizzaBuilder("80","199").setHelloMessage("Any message").build();
    }
}
