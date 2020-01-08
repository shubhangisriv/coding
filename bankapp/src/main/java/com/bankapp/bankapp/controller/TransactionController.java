package com.bankapp.bankapp.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.bankapp.bankapp.model.Account;
import com.bankapp.bankapp.model.Transaction;
import com.bankapp.bankapp.service.AccountService;
import com.bankapp.bankapp.service.TransactionService;


@Controller
public class TransactionController {

	
	@Autowired
    private AccountService accountService;
	
	@Autowired
	private TransactionService transactionService;
	
	
    @GetMapping("/transactions")
    public ModelAndView getTransactionByAccountNo(@Valid @ModelAttribute("account")Account account)
    {
    	ModelAndView mv=new ModelAndView("printTransaction");
    	List<Transaction> tList=transactionService.getAllTransactionsByAccountNo(account.getNo());
    	mv.addObject("tList",tList);
    	return mv;
    }
    
    
    
}
