package com.bankapp.util;

import com.bankapp.dto.AccountDto;
import com.bankapp.entities.Account;

import java.math.BigDecimal;

public class DtoConversion {
    // Convert Account → AccountDto
    public static AccountDto convertAccountToAccountDto(Account account) {
        if (account == null) {
            return null;
        }

        return AccountDto.builder()
                .id(account.getId())
                .name(account.getName())
                .balance(account.getBalance())
                .build();
    }

    // Convert AccountDto → Account
    public static Account convertAccountDtoToAccount(AccountDto accountDto) {
        if (accountDto == null) {
            return null;
        }

        return Account.builder()
                .id(accountDto.getId())
                .name(accountDto.getName())
                .balance(accountDto.getBalance())
                .build();
    }
}

