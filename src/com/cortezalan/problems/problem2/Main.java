package com.cortezalan.problems.problem2;

import com.cortezalan.problems.problem2.utils.Customer;
import com.cortezalan.problems.problem2.utils.DIET_PLAN;

public class Main {
    public static void main(String args[]) {
        Customer alan = new Customer("Alan", DIET_PLAN.NO_RESTRICTION);
        Customer rohan = new Customer("Rohan", DIET_PLAN.PALEO);
        Customer keane = new Customer("Keane", DIET_PLAN.VEGAN);
        Customer cesar = new Customer("Cesar", DIET_PLAN.NUT_ALLERGY);
        Customer corbin = new Customer("Corbin", DIET_PLAN.PALEO);
        Customer taylor = new Customer("Taylor", DIET_PLAN.VEGAN);

        alan.printCustomerDiet();
        rohan.printCustomerDiet();
        keane.printCustomerDiet();
        cesar.printCustomerDiet();
        corbin.printCustomerDiet();
        taylor.printCustomerDiet();
    }
}
