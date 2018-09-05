package com.company.builder;

import com.company.model.Pizza;

public class PizzaBuilder {
    private String size;
    private String price;

    private boolean cheese = false;
    private boolean pepperoni  = false;
    private String helloMessage = "Plain hello";

    public PizzaBuilder(String size,String price){
        this.size = size;
        this.price = price;
    }

    public void setCheese(boolean cheese) {
        this.cheese = cheese;
    }

    public void setPepperoni(boolean pepperoni) {
        this.pepperoni = pepperoni;
    }

    public void setHelloMessage(String helloMessage) {
        this.helloMessage = helloMessage;
    }

    public Pizza build() {
        return new Pizza();
    }
}
