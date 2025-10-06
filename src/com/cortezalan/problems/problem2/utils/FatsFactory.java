package com.cortezalan.problems.problem2.utils;

import com.cortezalan.problems.problem2.utils.fats.*;

import java.util.Random;

public class FatsFactory {
    private static FatsFactory instance = null;

    private FatsFactory(){}

    public static FatsFactory getInstance() {
        if (instance == null) {
            instance = new FatsFactory();
        }
        return instance;
    }

    public static Fat chooseCarbOption(DIET_PLAN dietPlan) {
        Random random = new Random();

        switch(dietPlan) {
            case DIET_PLAN.PALEO:
                int randomPaleoChoice = random.nextInt(3);

                if (randomPaleoChoice == 0) {
                    return new Avocado();
                } else if (randomPaleoChoice == 1) {
                    return new Tuna();
                } else {
                    return new Peanuts();
                }

            case DIET_PLAN.VEGAN:
                int randomVeganChoice = random.nextInt(2);

                if (randomVeganChoice == 0) {
                    return new Avocado();
                } else {
                    return new Peanuts();
                }

            case DIET_PLAN.NUT_ALLERGY:
                int randomNutAllergyChoice = random.nextInt(3);

                if (randomNutAllergyChoice == 0) {
                    return new Avocado();
                } else if (randomNutAllergyChoice == 1) {
                    return new SourCream();
                } else {
                    return new Tuna();
                }

            default:
                int randomNoRestrictionChoice = random.nextInt(4);

                if (randomNoRestrictionChoice == 0) {
                    return new Avocado();
                } else if (randomNoRestrictionChoice == 1) {
                    return new SourCream();
                } else if (randomNoRestrictionChoice == 2) {
                    return new Tuna();
                } else {
                    return new Peanuts();
                }
        }
    }
}
