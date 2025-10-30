package com.bankapp.service;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.bankapp.dto.AccountDto;
import com.bankapp.entities.Account;
import com.bankapp.exceptions.BankAccountNotFoundException;
import com.bankapp.repo.AccountRepo;
import com.bankapp.util.DtoConversion;

@Service
@Transactional
public class AccountServiceImpl implements AccountService {

	private AccountRepo accountRepo;

	public AccountServiceImpl(AccountRepo accountRepo) {
		this.accountRepo = accountRepo;
	}

	@Override
	public List<AccountDto> getAll() {
		return accountRepo.findAll().stream().map(DtoConversion::convertAccountToAccountDto).toList();
	}

	@Override
	public AccountDto getById(int id) {

		Account account = accountRepo.findById(id)
				.orElseThrow(() -> new BankAccountNotFoundException("bank account with id " + id + " is not found"));

		return DtoConversion.convertAccountToAccountDto(account);
	}

	@Override
	public void transfer(int fromAccId, int toAccId, BigDecimal amount) {

		AccountDto fromAcc = getById(fromAccId);
		AccountDto toAcc = getById(toAccId);

		fromAcc.setBalance(fromAcc.getBalance().subtract(amount));
		accountRepo.save(DtoConversion.convertAccountDtoToAccount(fromAcc));
//
//		if(1==1) {
//			throw new NullPointerException("some bug");
//		}
		
		toAcc.setBalance(toAcc.getBalance().add(amount));
		accountRepo.save(DtoConversion.convertAccountDtoToAccount(toAcc));
	}

}
