package com.bankapp.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.bankapp.dao.mappers.AccountRowMapper;
import com.bankapp.dto.Account;

@Repository
public class AccountDaoJdbcImpl implements AccountDao {

	private JdbcTemplate jdbcTemplate;

	public AccountDaoJdbcImpl(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	@Override
	public List<Account> getAll() {
		String sql = "SELECT id, name, balance FROM acc_table";
		return jdbcTemplate.query(sql, new AccountRowMapper());
	}

	@Override
	public Account getById(int id) {
		String sql = "SELECT id, name, balance FROM acc_table WHERE id = ?";
		return jdbcTemplate.queryForObject(sql, new AccountRowMapper(), id);
	}

	@Override
	public void updateAccount(Account account) {
		String sql = "UPDATE acc_table SET name = ?, balance = ? WHERE id = ?";
		jdbcTemplate.update(sql, new Object[] { account.getName(), account.getBalance(), account.getId() });
	}
}