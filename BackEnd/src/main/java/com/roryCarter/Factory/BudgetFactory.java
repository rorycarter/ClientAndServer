package com.roryCarter.Factory;

import com.roryCarter.Domain.Budget;

public class BudgetFactory {
    public static Budget buildBudget(String screenId, String name, double budget1, double foodPrices)
    {
        Budget budget=new Budget.Builder()
                .screenId(screenId)
                .name(name)
                .budget(budget1)
                .foodPrices(foodPrices)
                .build();
        return budget;
    }
}
