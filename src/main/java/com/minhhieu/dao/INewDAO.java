package com.minhhieu.dao;

import java.util.List;

import com.minhhieu.model.NewModel;
import com.minhhieu.paging.Pageble;

public interface INewDAO extends GenericDAO<NewModel> {
	
	List<NewModel> findAll();
	
}
