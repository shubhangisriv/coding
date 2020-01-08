package com.bankapp.bankapp.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.bankapp.bankapp.model.Transaction;

@Service("transactionService")
public interface TransactionService {

	public List<Transaction> getAllTransactionsByAccountNo(Long accountNo);
	public Transaction insertTransaction(Long accountNo,Transaction transaction);
}
