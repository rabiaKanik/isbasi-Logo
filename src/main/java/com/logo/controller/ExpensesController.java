package com.logo.controller;


import com.logo.model.Expenses;
import com.logo.service.ExpensesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value= "/purchase")
public class ExpensesController {

    @Autowired
    private ExpensesService expensesService;

    @GetMapping(value = "/all")
    private List<Expenses> getAllExpenses(){
        return expensesService.getAllExpenses();
    }

    @PostMapping
    private Expenses createExpenses(@RequestBody Expenses expensesRequest){
        return expensesService.createExpenses(expensesRequest);
    }

    @PutMapping
    private Expenses update(@RequestBody Expenses expenses){
        expensesService.update(expenses);
        return expenses;
    }

    //ADD DELETE METHOD
}
