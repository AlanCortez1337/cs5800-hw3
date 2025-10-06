package com.cortezalan.problems.problem1.utils;

import java.util.ArrayList;

public class PizzaBuilder {
    private ArrayList<String> toppings;
    private PIZZA_SIZE pizzaSize;

    public PizzaBuilder() {
        this.toppings = new ArrayList<String>();
    }

    public PizzaBuilder addPepperoni() {
        this.toppings.add("Pepperoni");
        return this;
    }
    public PizzaBuilder addSausage() {
        this.toppings.add("Sausage");
        return this;
    }
    public PizzaBuilder addMushrooms() {
        this.toppings.add("Mushrooms");
        return this;
    }
    public PizzaBuilder addBacon() {
        this.toppings.add("Bacon");
        return this;
    }
    public PizzaBuilder addOnions() {
        this.toppings.add("Onions");
        return this;
    }
    public PizzaBuilder addExtraCheese() {
        this.toppings.add("Extra Cheese");
        return this;
    }
    public PizzaBuilder addPeppers() {
        this.toppings.add("Peppers");
        return this;
    }
    public PizzaBuilder addChicken() {
        this.toppings.add("Chicken");
        return this;
    }
    public PizzaBuilder addOlives() {
        this.toppings.add("Olives");
        return this;
    }
    public PizzaBuilder addSpinach() {
        this.toppings.add("Spinach");
        return this;
    }
    public PizzaBuilder addTomatoAndBasil() {
        this.toppings.add("Tomato and Basil");
        return this;
    }
    public PizzaBuilder addBeef() {
        this.toppings.add("Beef");
        return this;
    }
    public PizzaBuilder addHam() {
        this.toppings.add("Ham");
        return this;
    }
    public PizzaBuilder addPesto() {
        this.toppings.add("Pesto");
        return this;
    }
    public PizzaBuilder addSpicyPork() {
        this.toppings.add("Spicy Pork");
        return this;
    }
    public PizzaBuilder addHamAndPineapple() {
        this.toppings.add("Ham and Pineapple");
        return this;
    }
    public PizzaBuilder setPizzaSize(PIZZA_SIZE chosenSize) {
        this.pizzaSize = chosenSize;
        return this;
    }
    public Pizza createPizza() {

        if (pizzaSize == null) {
            pizzaSize = PIZZA_SIZE.SMALL;
        }

        return new Pizza(
                toppings, pizzaSize
        );
    }
}
