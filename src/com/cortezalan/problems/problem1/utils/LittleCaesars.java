package com.cortezalan.problems.problem1.utils;

import java.util.ArrayList;

public class LittleCaesars extends PizzaChain {
    @Override
    void printPizzaChainName(){
        System.out.println("Little Caesars");
        System.out.println("------------");
    }
    @Override
    void bakeAndEatPizzaOrders(ArrayList<Pizza> pizzas) {
        this.printPizzaChainName();
        for (Pizza pizza : pizzas) {
            pizza.eat();
        }
    }
}