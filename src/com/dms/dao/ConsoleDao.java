package com.dms.dao;


import java.sql.SQLException;
import java.util.List;

import com.dms.domain.Console;
import com.dms.domain.Dealer;

public interface ConsoleDao {
	List<Console> findAll() throws SQLException;
}
