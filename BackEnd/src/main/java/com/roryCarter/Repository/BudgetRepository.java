package com.roryCarter.Repository;

import com.roryCarter.Domain.Budget;
import org.springframework.data.repository.CrudRepository;

public interface BudgetRepository extends CrudRepository<Budget,String> {
}
