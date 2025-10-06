package com.cortezalan.problems.problem2.utils;

import com.cortezalan.problems.problem2.utils.diets.*;

public class MacronutrientAbstractFactory {
    private static MacronutrientAbstractFactory instance = null;

    private MacronutrientAbstractFactory(){}

    public static MacronutrientAbstractFactory getInstance() {
        if (instance == null) {
            instance = new MacronutrientAbstractFactory();
        }
        return instance;
    }

    public static MacronutrientFactory createDietMealPlan(DIET_PLAN dietPlan) {
        switch (dietPlan) {
            case DIET_PLAN.PALEO:
                return new PaleoDiet();
            case DIET_PLAN.VEGAN:
                return new VeganDiet();
            case DIET_PLAN.NUT_ALLERGY:
                return new NutAllergyDiet();
            default:
                return new NoRestrictionsDiet();
        }
    }
}
