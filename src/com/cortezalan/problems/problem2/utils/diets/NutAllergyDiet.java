package com.cortezalan.problems.problem2.utils.diets;

import com.cortezalan.problems.problem2.utils.DIET_PLAN;
import com.cortezalan.problems.problem2.utils.carbs.Carb;
import com.cortezalan.problems.problem2.utils.carbs.CarbsFactory;
import com.cortezalan.problems.problem2.utils.fats.Fat;
import com.cortezalan.problems.problem2.utils.fats.FatsFactory;
import com.cortezalan.problems.problem2.utils.proteins.Protein;
import com.cortezalan.problems.problem2.utils.proteins.ProteinFactory;

public class NutAllergyDiet extends MacronutrientFactory {
    @Override
    public Fat generateFatFoodItem() {
        FatsFactory newFatFoodItem = FatsFactory.getInstance();
        return newFatFoodItem.chooseFatOption(DIET_PLAN.NUT_ALLERGY);
    }

    @Override
    public Protein generateProteinFoodItem() {
        ProteinFactory newProteinFoodItem = ProteinFactory.getInstance();
        return newProteinFoodItem.chooseProteinOption(DIET_PLAN.NUT_ALLERGY);
    }

    @Override
    public Carb generateCarbFoodItem() {
        CarbsFactory newCarbFoodItem = CarbsFactory.getInstance();
        return newCarbFoodItem.chooseCarbOption(DIET_PLAN.NUT_ALLERGY);
    }
}
