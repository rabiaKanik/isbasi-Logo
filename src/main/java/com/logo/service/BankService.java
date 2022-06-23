package com.logo.service;

import com.logo.model.Bank;
import com.logo.repository.BankRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;

public class BankService {

    @Autowired
    private BankRepository bankRepository;
    public List<Bank> getAllBanks() {
        List<Bank> banks = new ArrayList<Bank>();
        bankRepository.findAll().forEach(banks1 -> banks.add(banks1));
        return banks;
    }

    public Bank getBankByAccountNumber(Long accountNumber) {
        boolean isPresent = bankRepository.findByAccountNumber(accountNumber).isPresent();
        if (isPresent) {
            return bankRepository.findByAccountNumber(accountNumber).get();
        }
        // null dönme
        return null;
    }

    public List<Bank> delete(Long accountNumber) {
        List<Bank> banks = new ArrayList<Bank>();
        bankRepository.deleteByAccountNumber(accountNumber);
        return banks;
    }

    public Bank createBank(Bank request) {
        return bankRepository.save(request);
    }

    public void update(Bank bank) {
        bankRepository.save(bank);
    }
}
