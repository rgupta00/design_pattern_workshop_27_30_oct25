package com.bankapp.service;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bankapp.dao.AccountDao;
import com.bankapp.dao.AccountDaoMapImpl;
import com.bankapp.dto.Account;
@Service
public class AccountServiceImpl implements AccountService {

	private AccountDao accountDao;

	@Autowired
	public AccountServiceImpl(AccountDao accountDao) {
		this.accountDao = accountDao;
	}

	@Override
	public List<Account> getAll() {
		return accountDao.getAll();
	}

	@Override
	public Account getById(int id) {
		
		return null;
	}

	@Override
	public void transfer(int fromAccId, int toAccId, BigDecimal amount) {

	}

}
