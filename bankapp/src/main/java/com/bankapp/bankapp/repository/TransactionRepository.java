package com.bankapp.bankapp.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bankapp.bankapp.model.Transaction;


@Repository
public interface TransactionRepository extends JpaRepository<Transaction , Long>{
	
	List<Transaction> findByAccountNo(Long accountNo);
    Optional<Transaction> findByIdAndAccountNo(Long id, Long accountNo);

}
