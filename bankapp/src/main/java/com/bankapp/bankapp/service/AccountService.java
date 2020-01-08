package com.bankapp.bankapp.service;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.bankapp.bankapp.model.Account;


@Service("accountService")
public interface AccountService {
	
	public List<Account> listAccounts();
	
	public Account addNewAccount( Account account);
	
	public String deleteAccount(Long no);
	public  Account findByAccountNo(Long no,Account account);
	

}
