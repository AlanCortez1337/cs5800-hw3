package com.cortezalan.problems.problem2.utils.carbs;

import com.cortezalan.problems.problem2.utils.DIET_PLAN;

import java.util.Random;

public class CarbsFactory {
    private static CarbsFactory instance = null;

    private CarbsFactory(){}

    public static CarbsFactory getInstance() {
        if (instance == null) {
            instance = new CarbsFactory();
        }
        return instance;
    }

    public static Carb chooseCarbOption(DIET_PLAN dietPlan) {
        Random random = new Random();

        switch(dietPlan) {
            case DIET_PLAN.PALEO:
                return new Pistachio();

            case DIET_PLAN.VEGAN:
                int randomVeganChoice = random.nextInt(3);

                if (randomVeganChoice == 0) {
                    return new Bread();
                } else if (randomVeganChoice == 1) {
                    return new Lentils();
                } else {
                    return new Pistachio();
                }

            case DIET_PLAN.NUT_ALLERGY:
                int randomNutAllergyChoice = random.nextInt(3);

                if (randomNutAllergyChoice == 0) {
                    return new Bread();
                } else if (randomNutAllergyChoice == 1) {
                    return new Lentils();
                } else {
                    return new Cheese();
                }

            default:
                int randomNoRestrictionChoice = random.nextInt(4);

                if (randomNoRestrictionChoice == 0) {
                    return new Bread();
                } else if (randomNoRestrictionChoice == 1) {
                    return new Lentils();
                } else if (randomNoRestrictionChoice == 2) {
                    return new Cheese();
                } else {
                    return new Pistachio();
                }
        }
    }
}
