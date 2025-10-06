package com.cortezalan.problems.problem1.utils;

import java.util.ArrayList;

public class PizzaHut extends PizzaChain {
    @Override
    void printPizzaChainName(){
        System.out.println("Pizza Hut");
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
