package com.bankapp.bankapp.controller;

import javax.validation.Valid;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.bankapp.bankapp.model.Account;
import com.bankapp.bankapp.model.Transaction;
import com.bankapp.bankapp.service.AccountService;
import com.bankapp.bankapp.service.TransactionService;


@Controller
@RequestMapping("/accounts")
public class AccountController {

	@Autowired
    private AccountService accountService;
	
	@Autowired
    private TransactionService transactionService;

	@PostMapping("/login")
	public ModelAndView requestLogin(@RequestParam String user, @RequestParam String password)
	{
		ModelAndView modelAndView;
		if ((user.equals("user")) && (password.equals("password"))) {
			modelAndView = new ModelAndView("home");
		} else {
			modelAndView = new ModelAndView("index");
		}
		return modelAndView;
	}
	@GetMapping("/createAccount")
	public ModelAndView createAccount()
	{
		return new ModelAndView("createAccount", "account", new Account());
	}
	
	@PostMapping("/createAccount")
	public ModelAndView saveAccount(@Valid @ModelAttribute("account")Account account)
	{
		ModelAndView mv=new ModelAndView("showBalance");
		mv.addObject(accountService.addNewAccount(account));
		return mv;
	}
	@GetMapping("/deleteAccount")
	public ModelAndView deleteForm()
	{
		Account account=new Account();
		ModelAndView mv=new ModelAndView("deleteAccount","account",account);
		return mv;
	}
	@DeleteMapping("/deleteAccount")
	public ModelAndView deleteAccount(@Valid @ModelAttribute("account")Account account)
	{
		String message=accountService.deleteAccount(account.getNo());
		if(message.equals("deleted"))
			message="Account No : "+account.getNo()+"Deleted Successfully";
		else
			message="Account No : "+account.getNo()+" has not been deleted";
		ModelAndView mv=new ModelAndView("message");
		mv.addObject("earful",message);
		return mv;
		
	}
	@GetMapping("/earful")
	public ModelAndView earfulPage()
	{
		ModelAndView mv=new ModelAndView("earful");
		return mv;
	}
	
	@GetMapping("/showBalance")
	public String showBalance()
	{
		return "showBalance";
	}
	@GetMapping("/deposit")
	public String depositAmount()
	{
		return "deposit";
	}
	
	@PostMapping("/deposit")
	public ModelAndView depositAmount(@RequestParam Long accountNo, @RequestParam String type, @RequestParam Double amount)
	{
		System.out.println("Account No : "+accountNo);
		Transaction transaction=new Transaction();
		transaction.setAmount(amount);
		transaction.setType(type);
		ModelAndView mv=new ModelAndView("showTransaction");
		Transaction t=transactionService.insertTransaction(accountNo,transaction);
	    mv.addObject("transaction", t);
		return mv;
	}	
	
	@GetMapping("/withdraw")
	public String withdrawAmount()
	{
		return "withdraw";
	}
	
	@PostMapping("/withdraw")
	public ModelAndView withdrawAmount(@RequestParam Long accountNo, @RequestParam String type, @RequestParam Double amount)

	{
		System.out.println("Account No : "+accountNo);
		Transaction transaction=new Transaction();
		transaction.setAmount(amount);
		transaction.setType(type);
		ModelAndView mv=new ModelAndView("showTransaction");
		Transaction t=transactionService.insertTransaction(accountNo,transaction);
	    mv.addObject("transaction", t);
		return mv;
	}
	
	@GetMapping("/fundsTransfer")
	public String fundsTransfer()

	{
		return "fundsTransfer";
	}
	
	@PostMapping("/fundsTransfer")
	public ModelAndView fundsTransfer(@RequestParam Long accountNo, @RequestParam String type, @RequestParam Double amount)
	{
		System.out.println("Account No : "+accountNo);
		Transaction transaction=new Transaction();
		transaction.setAmount(amount);
		transaction.setType(type);
		ModelAndView mv=new ModelAndView("showTransaction");
		Transaction t=transactionService.insertTransaction(accountNo,transaction);
	    mv.addObject("transaction", t);
		return mv;
	}
	@GetMapping("/printTransaction")
	public String printTransaction()
	{
		return "printTransaction";
	}
	@GetMapping("/home")
	public String homePage()
	{
		return "home";
	}
}
