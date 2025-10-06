package com.cortezalan.problems.problem2.utils.proteins;

import com.cortezalan.problems.problem2.utils.DIET_PLAN;

import java.util.Random;

public class ProteinFactory {
    private static ProteinFactory instance = null;

    private ProteinFactory(){}

    public static ProteinFactory getInstance() {
        if (instance == null) {
            instance = new ProteinFactory();
        }
        return instance;
    }

    public static Protein chooseProteinOption(DIET_PLAN dietPlan) {
        Random random = new Random();

        switch(dietPlan) {
            case DIET_PLAN.PALEO:
                int randomPaleoChoice = random.nextInt(3);

                if (randomPaleoChoice == 0) {
                    return new Fish();
                } else if (randomPaleoChoice == 1) {
                    return new Chicken();
                } else {
                    return new Beef();
                }

            case DIET_PLAN.VEGAN:
                return new Tofu();

            case DIET_PLAN.NUT_ALLERGY:
            default:
                int randomNoRestrictionChoice = random.nextInt(4);

                if (randomNoRestrictionChoice == 0) {
                    return new Fish();
                } else if (randomNoRestrictionChoice == 1) {
                    return new Chicken();
                } else if (randomNoRestrictionChoice == 2) {
                    return new Beef();
                } else {
                    return new Tofu();
                }
        }
    }
}
