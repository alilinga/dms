package com.dms.dao;

import java.sql.SQLException;
import java.util.List;

import com.dms.domain.Dealer;
import com.dms.domain.Goods;

public interface DealerDao {

	List<Dealer> findAll() throws SQLException;
}
