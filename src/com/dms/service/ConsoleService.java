package com.dms.service;

import java.sql.SQLException;
import java.util.List;

import com.dms.domain.Console;
import com.dms.domain.Dealer;

public interface ConsoleService {
	List<Console> findAll() throws SQLException;
}
