package com.bankapp.dao;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Repository;

import com.bankapp.dto.Account;
@Repository
@Profile("dev")
public class AccountDaoJdbcImpl implements AccountDao{
	
	private Map<Integer, Account> accounts=new HashMap<>();
	
	public AccountDaoJdbcImpl() {
		accounts.put(1, new Account(1, "raj", BigDecimal.valueOf(1000.00)));
		accounts.put(2, new Account(2, "ekta", BigDecimal.valueOf(1000.00)));
	}
	@Override
	public List<Account> getAll() {
		System.out.println("getAll using jdbc code...");
		return new ArrayList<Account>(accounts.values());
	}

	@Override
	public Account getById(int id) {
		return accounts.get(id);
	}

	@Override
	public void updateAccount(Account account) {
		accounts.put(account.getId(), account);
	}

}
