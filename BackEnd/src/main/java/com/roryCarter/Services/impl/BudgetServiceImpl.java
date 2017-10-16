package com.roryCarter.Services.impl;

import com.roryCarter.Domain.Budget;
import com.roryCarter.Repository.BudgetRepository;
import com.roryCarter.Services.BudgetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BudgetServiceImpl implements BudgetService {


    @Autowired
    private BudgetRepository budgetRepository;

    @Override
    public Budget save(Budget entity)
    {
        return budgetRepository.save(entity);
    }

    @Override
    public Budget findById(String s)
    {
        return budgetRepository.findOne(s);
    }

    @Override
    public Budget update(Budget entity)
    {
        return budgetRepository.save(entity);
    }

    @Override
    public void delete(Budget entity)
    {
        budgetRepository.delete(entity);
    }
}
