package com.bankapp.bankapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bankapp.bankapp.model.Transaction;
import com.bankapp.bankapp.repository.AccountRepository;
import com.bankapp.bankapp.repository.TransactionRepository;
import com.bankapp.bankapp.exception.*;

@Service("TransactionService")
public class TransactionServiceImpl implements TransactionService {

	@Autowired
    private TransactionRepository transactionRepository;

    @Autowired
    private AccountRepository accountRepository;
	public List<Transaction> getAllTransactionsByAccountNo(Long accountNo) {
		
		return transactionRepository.findByAccountNo(accountNo);
	}
	public Transaction insertTransaction(Long accountNo,Transaction transaction)

	{
		System.out.println("Transaction Service Called...");
		return accountRepository.findById(accountNo).map(account -> {
			String tType=transaction.getType();
			if(tType.equals("Deposit"))
				account.setAmount(account.getAmount()+transaction.getAmount());
			else if(tType.equals("Withdraw") || tType.equals("FundsTransfer"))
				account.setAmount(account.getAmount()-transaction.getAmount());
			accountRepository.save(account);
            transaction.setAccount(account);
            return transactionRepository.save(transaction);
        }).orElseThrow(() -> new ResourceNotFoundException("Account " + accountNo + " not found"));
	}
}
