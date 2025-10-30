package com.bankapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.bankapp.dto.AccountDto;
import com.bankapp.dto.TransferDto;
import com.bankapp.service.AccountService;
import com.bankapp.service.AccountServiceFacade;
import com.bankapp.service.FraudService;
import com.bankapp.service.LedgerService;
import com.bankapp.service.NotificationService;

import lombok.AllArgsConstructor;

@RestController
@AllArgsConstructor
public class AccountController {

	private AccountServiceFacade accountServiceFacade;

	@GetMapping(path = "accounts")
	public List<AccountDto> getAllAccounts() {

		return accountServiceFacade.getAll();
	}

	@GetMapping(path = "accounts/{id}")
	public AccountDto getAccount(@PathVariable int id) {
		return accountServiceFacade.getById(id);
	}

	@PostMapping(path = "transfer")
	public String tranfer(@RequestBody TransferDto transferDto) {
		accountServiceFacade.transfer(transferDto.getFromAccId(), transferDto.getToAccId(), transferDto.getAmount());

		return "fund transfer successfully";
	}

	/*
	 * 
	 * @PostMapping(path = "deposit") public String deposit(@RequestBody DepositrDto
	 * dto)
	 * 
	 * @PostMapping(path = "withdraw") public String withdraw(@RequestBody
	 * WithdrawDto dto)
	 * 
	 */
}
