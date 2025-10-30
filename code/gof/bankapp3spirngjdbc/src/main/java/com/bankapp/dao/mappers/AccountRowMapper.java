package com.bankapp.dao.mappers;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.bankapp.dto.Account;

public class AccountRowMapper implements RowMapper<Account> {
	@Override
	public Account mapRow(ResultSet rs, int rowNum) throws SQLException {	
		return new Account(rs.getInt(1), rs.getString(2), rs.getBigDecimal(3));
	}
}
