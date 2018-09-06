package com.company.builder;

import com.company.model.Eating;
import com.company.model.Pizza;

public class PizzaBuilder implements Builder{
    private String size;
    private String price;

    private boolean cheese = false;
    private boolean pepperoni  = false;
    private String helloMessage = "Plain hello";

    public PizzaBuilder(String size, String price) {
        this.size = size;
        this.price = price;
    }

    public PizzaBuilder setSize(String size) {
        this.size = size;
        return this;
    }

    public PizzaBuilder setPrice(String price) {
        this.price = price;
        return this;
    }

    public PizzaBuilder setCheese(boolean cheese) {
        this.cheese = cheese;
        return this;
    }

    public PizzaBuilder setPepperoni(boolean pepperoni) {
        this.pepperoni = pepperoni;
        return this;
    }

    public PizzaBuilder setHelloMessage(String helloMessage) {
        this.helloMessage = helloMessage;
        return this;
    }

    public String getSize() {
        return size;
    }

    public String getPrice() {
        return price;
    }

    public boolean isCheese() {
        return cheese;
    }

    public boolean isPepperoni() {
        return pepperoni;
    }

    public String getHelloMessage() {
        return helloMessage;
    }

    public Eating build() {
        return new Pizza(this);
    }
}
