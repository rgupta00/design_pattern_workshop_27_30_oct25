package com.bankapp.service;

import java.math.BigDecimal;
import java.util.List;

import com.bankapp.dto.AccountDto;
//SL= Brain of ur app= FR +NFR (CCC/AOP (proxy dp))
public interface AccountService {
    public List<AccountDto> getAll();
    public AccountDto getById(int id);
    public void transfer(int fromAccId, int toAccId, BigDecimal amount);
 
}
