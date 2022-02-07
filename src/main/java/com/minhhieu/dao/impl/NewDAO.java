package com.minhhieu.dao.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.minhhieu.dao.INewDAO;
import com.minhhieu.mapper.NewMapper;
import com.minhhieu.model.NewModel;

@Repository
public class NewDAO extends AbstractDAO<NewModel> implements INewDAO {
	
	
	@Override
	public List<NewModel> findAll() {
		StringBuilder sql = new StringBuilder("SELECT * FROM news");
		return query(sql.toString(), new NewMapper());
	}

	
}
