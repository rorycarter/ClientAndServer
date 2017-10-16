package com.roryCarter.Domain;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Budget {

    //double calcBudget();
    @Id
    private String screenId;
    private String name;
    private double foodPrices;
    private double budget;


    public void setScreenId(String screenId) {
        this.screenId = screenId;
    }

    public String getScreenId() {
        return screenId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getFoodPrices() {
        return foodPrices;
    }

    public double calcBudget() {
        return budget-foodPrices;

    }

    public double getBudget() {
        return budget;
    }

    public String getName() {
        return name;
    }

    public Budget()
    {


    }
    private Budget(Builder builder)
    {
        this.budget=builder.budget;
        this.foodPrices=builder.foodPrices;
        this.screenId=builder.screenId;
        this.name=builder.name;
    }
    public static class Builder
    {

        private double budget;
        private double foodPrices;
        private String screenId;
        private String name;

        public Builder budget(double value)
        {
            this.budget=value;
            return this;


        }
        public Builder foodPrices(double value)
        {

            this.foodPrices=value;
            return this;
        }
        public Builder screenId(String value)
        {

            this.screenId=value;
            return this;

        }
        public Builder name(String value)
        {
            this.name=value;
            return this;
        }
        public Budget build()
        {
            return new Budget(this);

        }

    }

}
