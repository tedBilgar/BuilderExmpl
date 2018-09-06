package com.company.model;

import com.company.builder.PizzaBuilder;

public class Pizza {
    private String size;
    private String price;

    private boolean cheese;
    private boolean pepperoni;
    private String helloMessage;

    public Pizza(PizzaBuilder pizzaBuilder){
        this.size = pizzaBuilder.getSize();
        this.price = pizzaBuilder.getPrice();
        this.cheese = pizzaBuilder.isCheese();
        this.pepperoni = pizzaBuilder.isPepperoni();
        this.helloMessage = pizzaBuilder.getHelloMessage();
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public boolean isCheese() {
        return cheese;
    }

    public void setCheese(boolean cheese) {
        this.cheese = cheese;
    }

    public boolean isPepperoni() {
        return pepperoni;
    }

    public void setPepperoni(boolean pepperoni) {
        this.pepperoni = pepperoni;
    }

    public String getHelloMessage() {
        return helloMessage;
    }

    public void setHelloMessage(String helloMessage) {
        this.helloMessage = helloMessage;
    }

    @Override
    public String toString() {
        return "Pizza{" +
                "size='" + size + '\'' +
                ", price='" + price + '\'' +
                ", cheese=" + cheese +
                ", pepperoni=" + pepperoni +
                ", helloMessage='" + helloMessage + '\'' +
                '}';
    }
}
