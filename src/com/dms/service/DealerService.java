package com.dms.service;

import java.sql.SQLException;
import java.util.List;

import com.dms.domain.Dealer;

public interface DealerService {
	List<Dealer> findAll() throws SQLException;
}
