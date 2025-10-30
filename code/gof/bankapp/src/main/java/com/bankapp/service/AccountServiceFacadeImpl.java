package com.bankapp.service;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.stereotype.Service;

import com.bankapp.dto.AccountDto;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class AccountServiceFacadeImpl implements AccountServiceFacade {

	private final AccountService accountService;
	private final LedgerService ledgerService;
	private final FraudService fraudService;
	private final NotificationService notificationService;

	@Override
	public List<AccountDto> getAll() {
		return accountService.getAll();
	}

	@Override
	public AccountDto getById(int id) {
		return accountService.getById(id);
	}

	@Override
	public void transfer(int fromAccId, int toAccId, BigDecimal amount) {
		fraudService.validate(fromAccId, toAccId, toAccId);
		accountService.transfer(fromAccId, toAccId, amount);
		ledgerService.record(fromAccId, toAccId, amount);
		notificationService.send("foo@gmail.com");

	}

}
