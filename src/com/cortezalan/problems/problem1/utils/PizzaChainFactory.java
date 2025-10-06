package com.cortezalan.problems.problem1.utils;

import java.util.ArrayList;

public class PizzaChainFactory {
    public static PizzaChain getPizzaChain(PIZZA_CHAIN chainName) {
        switch (chainName) {
            case PIZZA_CHAIN.PIZZA_HUT:
                return new PizzaHut();
            case PIZZA_CHAIN.LITTLE_CAESARS:
                return new LittleCaesars();
            case PIZZA_CHAIN.DOMINOS:
                return new Dominos();
            default:
                return null;
        }
    }
    public static void getPizzaOrders (PIZZA_CHAIN chainName, ArrayList<Pizza> orders) {
        PizzaChain chain = getPizzaChain(chainName);
        if (!orders.isEmpty()) {
            chain.bakeAndEatPizzaOrders(orders);
        }
    }
}
