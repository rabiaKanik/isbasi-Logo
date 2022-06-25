package com.logo.service;

import com.logo.model.Expenses;
import com.logo.repository.ExpensesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ExpensesService {

    @Autowired
    private ExpensesRepository expensesRepository;

    public List<Expenses> getAllExpenses(){
        List<Expenses> expenses = new ArrayList<>();
        expensesRepository.findAll().forEach(expenses1 -> expenses.add(expenses1));
        return expenses;
    }

    public Expenses createExpenses(Expenses expensesRequest) {
        return expensesRepository.save(expensesRequest);
    }

    public void update(Expenses expenses) {
        expensesRepository.save(expenses);
    }
}
