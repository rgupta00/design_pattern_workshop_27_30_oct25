package com.bankapp.service;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bankapp.dao.AccountDao;
import com.bankapp.dao.AccountDaoMapImpl;
import com.bankapp.dto.Account;
import com.bankapp.exceptions.BankAccountNotFoundException;

@Service
public class AccountServiceImpl implements AccountService {

	private AccountDao accountDao;

	public AccountServiceImpl(AccountDao accountDao) {
		this.accountDao = accountDao;
	}

	@Override
	public List<Account> getAll() {
		return accountDao.getAll();
	}

	@Override
	public Account getById(int id) {
		Account account = accountDao.getById(id);
		if (account == null) {
			throw new BankAccountNotFoundException("account with " + id + " is not found");
		}
		return account;
	}

	@Override
	public void transfer(int fromAccId, int toAccId, BigDecimal amount) {

		Account fromAcc= getById(fromAccId);
		Account toAcc= getById(toAccId);
		
		fromAcc.setBalance(fromAcc.getBalance().subtract(amount));
		accountDao.updateAccount(fromAcc);
		
		toAcc.setBalance(toAcc.getBalance().add(amount));
		accountDao.updateAccount(toAcc);
	}

}
