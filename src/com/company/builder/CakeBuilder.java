package com.company.builder;

import com.company.model.Cake;

public class CakeBuilder {
    private String weight;
    private String height;

    private boolean isMeat = false;
    private boolean isCherry= false;

    public CakeBuilder(String weight, String height) {
        this.weight = weight;
        this.height = height;
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

    public CakeBuilder setMeat(boolean meat) {
        isMeat = meat;
        return this;
    }

    public boolean isCherry() {
        return isCherry;
    }

    public CakeBuilder setCherry(boolean cherry) {
        isCherry = cherry;
        return this;
    }

    public Cake build(){
        return new Cake(this);
    }
}
