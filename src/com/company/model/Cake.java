package com.company.model;

import com.company.builder.CakeBuilder;

import java.util.logging.SocketHandler;

public class Cake implements Eating{
    private String weight;
    private String height;

    private boolean isMeat = false;
    private boolean isCherry= false;

    public Cake(CakeBuilder cakeBuilder) {
        this.weight = cakeBuilder.getWeight();
        this.height = cakeBuilder.getHeight();
        this.isMeat = cakeBuilder.isMeat();
        this.isCherry = cakeBuilder.isCherry();
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    public String getHeight() {
        return height;
    }

    public void setHeight(String height) {
        this.height = height;
    }

    public boolean isMeat() {
        return isMeat;
    }

    public void setMeat(boolean meat) {
        isMeat = meat;
    }

    public boolean isCherry() {
        return isCherry;
    }

    public void setCherry(boolean cherry) {
        isCherry = cherry;
    }

    @Override
    public String toString() {
        return "Cake{" +
                "weight='" + weight + '\'' +
                ", height='" + height + '\'' +
                ", isMeat=" + isMeat +
                ", isCherry=" + isCherry +
                '}';
    }

    @Override
    public void start() {
        System.out.println("Это пирожок: ");
        System.out.println(this.toString());
    }
}
