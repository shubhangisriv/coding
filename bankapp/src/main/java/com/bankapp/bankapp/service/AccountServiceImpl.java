package com.bankapp.bankapp.service;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import com.bankapp.bankapp.exception.ResourceNotFoundException;
import com.bankapp.bankapp.model.Account;
import com.bankapp.bankapp.repository.AccountRepository;

@Service("accountService")
public class AccountServiceImpl implements AccountService{
	
	@Autowired
	private AccountRepository accountRepository;

	public List<Account> listAccounts()
	{
		List<Account> accountList = accountRepository.findAll();
		return accountList;
	}
	
	public Account addNewAccount(@Valid @RequestBody Account account) {
        return accountRepository.save(account);
		
	}
	
	public String deleteAccount(@PathVariable Long no) {
	        return accountRepository.findById(no).map(account -> {
	        	accountRepository.delete(account);
	            return "deleted";
	        }).orElseThrow(() -> new ResourceNotFoundException("Account No " + no + " not found"));
	}
	public  Account findByAccountNo(Long no,Account account){
		Account updatedAccount=accountRepository.findById(no).map(a -> {
            a.setName(account.getName());
            a.setAmount(account.getAmount());
            return accountRepository.save(a);
        }).orElseThrow(() -> new ResourceNotFoundException("Account No " + no + " not found"));
		return updatedAccount;
	}

	
}
