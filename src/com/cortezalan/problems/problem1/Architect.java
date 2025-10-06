package com.cortezalan.problems.problem1;

import com.cortezalan.problems.problem1.utils.*;

import java.util.ArrayList;

public class Architect {
    public static void main(String[] args) {
        // Problem 1.1
        Pizza smallPizza = new PizzaBuilder().addExtraCheese().addPepperoni().addBacon().createPizza();
        Pizza mediumPizza = new PizzaBuilder().setPizzaSize(PIZZA_SIZE.MEDIUM).addBeef().addChicken().addHam().addExtraCheese().addPepperoni().addBacon().createPizza();
        Pizza largePizza = new PizzaBuilder().setPizzaSize(PIZZA_SIZE.LARGE).addMushrooms().addOlives().addPesto().addBeef().addChicken().addHam().addExtraCheese().addPepperoni().addBacon().createPizza();

        smallPizza.eat();
        mediumPizza.eat();
        largePizza.eat();

        // Problem 1.2
        Pizza pizzaHutOrder1 = new PizzaBuilder().setPizzaSize(PIZZA_SIZE.LARGE).addExtraCheese().addPepperoni().addBacon().createPizza();
        Pizza pizzaHutOrder2 = new PizzaBuilder().addExtraCheese().addPepperoni().createPizza();

        ArrayList<Pizza> pizzaHutOrders = new ArrayList<Pizza>();
        pizzaHutOrders.add(pizzaHutOrder1);
        pizzaHutOrders.add(pizzaHutOrder2);

        PizzaChainFactory pizzaHut = new PizzaChainFactory();
        pizzaHut.getPizzaOrders(PIZZA_CHAIN.PIZZA_HUT, pizzaHutOrders);

        Pizza littleCaesarsOrder1 = new PizzaBuilder().setPizzaSize(PIZZA_SIZE.MEDIUM).addExtraCheese().addOlives().addMushrooms().addHamAndPineapple().addOnions().addSpicyPork().addPepperoni().addBacon().createPizza();
        Pizza littleCaesarsOrder2 = new PizzaBuilder().addExtraCheese().addPepperoni().addOnions().addSpicyPork().addBeef().addBacon().createPizza();

        ArrayList<Pizza> littleCaesarsOrders = new ArrayList<Pizza>();
        littleCaesarsOrders.add(littleCaesarsOrder1);
        littleCaesarsOrders.add(littleCaesarsOrder2);

        PizzaChainFactory littleCaesars = new PizzaChainFactory();
        littleCaesars.getPizzaOrders(PIZZA_CHAIN.LITTLE_CAESARS, littleCaesarsOrders);


        Pizza dominosOrder1 = new PizzaBuilder().addExtraCheese().createPizza();
        Pizza dominosOrder2 = new PizzaBuilder().setPizzaSize(PIZZA_SIZE.LARGE).addSpicyPork().addExtraCheese().addPepperoni().createPizza();

        ArrayList<Pizza> dominosOrders = new ArrayList<Pizza>();
        dominosOrders.add(dominosOrder1);
        dominosOrders.add(dominosOrder2);

        PizzaChainFactory dominos = new PizzaChainFactory();
        dominos.getPizzaOrders(PIZZA_CHAIN.DOMINOS, dominosOrders);
    }
}
