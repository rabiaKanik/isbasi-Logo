package com.logo.repository;


import com.logo.model.Expenses;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class ExpensesRepository {

    private static List<Expenses> expensesList = new ArrayList<>();

    public List<Expenses> findAll() {
        return expensesList;
    }

    public Expenses save(Expenses expensesRequest) {
        expensesList.add(expensesRequest);
        return expensesRequest;
    }
}
