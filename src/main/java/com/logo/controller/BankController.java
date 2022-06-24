package com.logo.controller;

import com.logo.model.Bank;
import com.logo.service.BankService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class BankController {

    @Autowired
    private BankService bankService;

    //Var olan bankaları listeleme
    @GetMapping(value = "/banks")
    private List<Bank> getAllBanks(){
        return bankService.getAllBanks();
    }

    //Hesap numarasına göre hesabı getirme
    @GetMapping(value = "/banks/{accountNumber}")
    private Bank getBanksByAccountNumber(@PathVariable("accountNumber") Long accountNumber){
        return bankService.getBankByAccountNumber(accountNumber);
    }

    //Hesap numarasına göre o hesabı silme
    @DeleteMapping
    private List<Bank> deleteBank(@PathVariable("accountNumber") Long accountNumber){
        return bankService.delete(accountNumber);
    }

    //Banka ekleme
    @PostMapping
    private Bank createBank(@RequestBody Bank bankRequest){
        return bankService.createBank(bankRequest);
    }

    /*
    //Hesap ekleme
    @PostMapping
    private Long saveAccountNumber(@RequestBody Bank bank){
        bankService.save(bank);
        return bank.getAccountNumber();
    }
     */

    //Banka bilgileri güncelleme
    @PutMapping(value = "/banks")
    private Bank update(@RequestBody Bank bank ){
        bankService.update(bank);
        return bank;
    }

}
