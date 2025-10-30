package com.bankapp.service;
import java.math.BigDecimal;
import java.util.List;
import com.bankapp.dto.AccountDto;

public interface AccountServiceFacade {

	    public List<AccountDto> getAll();
	    public AccountDto getById(int id);
	    public void transfer(int fromAccId, int toAccId, BigDecimal amount);
	 
}
