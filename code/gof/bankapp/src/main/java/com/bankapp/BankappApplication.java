package com.bankapp;

import java.math.BigDecimal;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

import com.bankapp.entities.Account;
import com.bankapp.repo.AccountRepo;

import jakarta.persistence.EntityManager;
@EnableAspectJAutoProxy
@SpringBootApplication
public class BankappApplication implements CommandLineRunner{

	@Autowired
	private AccountRepo accountRepo;
	
	public static void main(String[] args) {
		SpringApplication.run(BankappApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
//		accountRepo.save(new Account("raj", BigDecimal.valueOf(1000)));
//		accountRepo.save(new Account("ekta", BigDecimal.valueOf(1000)));
	}

}
