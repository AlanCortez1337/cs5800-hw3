package com.cortezalan.problems.problem1.utils;

import java.util.ArrayList;

public class Pizza {
    private ArrayList<String> toppings;

    private PIZZA_SIZE pizzaSize;

    public Pizza(ArrayList<String> toppings, PIZZA_SIZE pizzaSize) {
        this.toppings = toppings;
        this.pizzaSize = pizzaSize;
    }

    public void eat() {
        String pizzaDetails = "";
        StringBuilder toppingDetails = new StringBuilder();
        int toppingCount = toppings.size();

        if(pizzaSize == PIZZA_SIZE.LARGE) {
            pizzaDetails = "Large pizza with ";
        } else if (pizzaSize == PIZZA_SIZE.MEDIUM) {
            pizzaDetails = "Medium pizza with ";
        } else {
            pizzaDetails = "Small pizza with ";
        }

        for (int toppingsListIndex = 0; toppingsListIndex < toppingCount; toppingsListIndex++) {
            boolean isTheNextIndexTheEnd = toppingsListIndex + 1 == toppingCount;

            toppingDetails.append(toppings.get(toppingsListIndex));

            if (isTheNextIndexTheEnd) {
                toppingDetails.append(".");
            } else {
                toppingDetails.append(", ");
            }
        }

        System.out.println(pizzaDetails + toppingDetails + " (" + toppingCount + " toppings)");
    }
}