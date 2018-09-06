package com.company;

import com.company.builder.Director;


public class Main {

    public static void main(String[] args) {
        Director director = new Director();

        director.buildCake().start();
        director.buildPizza().start();
    }
}
