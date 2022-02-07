package com.minhhieu.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.minhhieu.dao.INewDAO;
import com.minhhieu.model.NewModel;
import com.minhhieu.service.INewService;

@Service
public class NewService implements INewService {
	
	@Autowired
	private INewDAO newDao;

	@Override
	public List<NewModel> findAll() {
		return newDao.findAll();
	}



}
