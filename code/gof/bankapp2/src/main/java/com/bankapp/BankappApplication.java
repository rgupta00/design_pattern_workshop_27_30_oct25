package com.bankapp;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

import jakarta.persistence.EntityManager;
@EnableAspectJAutoProxy
@SpringBootApplication
public class BankappApplication implements CommandLineRunner{

	@Autowired
	private DataSource dataSource;
	
	@Autowired
	private EntityManager entityManager;
	
	
	public static void main(String[] args) {
		SpringApplication.run(BankappApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		if(dataSource!=null) {
			System.out.println("ds is created");
		}
		if(entityManager!=null) {
			System.out.println("entityManager is created");
		}
	}

}
