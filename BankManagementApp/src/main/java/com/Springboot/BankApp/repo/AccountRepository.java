package com.Springboot.BankApp.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Springboot.BankApp.Account;

public interface AccountRepository extends JpaRepository<Account, Long>{
	

}
