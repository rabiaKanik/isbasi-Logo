package com.logo.repository;

import com.logo.model.Bank;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Repository
public class BankRepository {

    private static List<Bank> bankList = new ArrayList<>();

    public Optional<Bank> findByAccountNumber(Long accountNumber) {
        return bankList.stream().filter(bank -> bank.getAccountNumber().equals(accountNumber)).findFirst();
    }

    public List<Bank> findAll() {
        return bankList;
    }

    public List<Bank> deleteByAccountNumber(Long accountNumber) {
       for(Bank item : bankList){
           if(item.getAccountNumber() == accountNumber){
               bankList.remove(item);
           }
       }
        return bankList;
    }

    public Bank save(Bank request) {
        bankList.add(request);
        return request;
    }


}
