package com.minhhieu.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.minhhieu.entity.CategoryEntity;
import com.minhhieu.repository.CategoryRepository;
import com.minhhieu.service.ICategoryService;

@Service
public class CategoryService implements ICategoryService {
	
	@Autowired
	private CategoryRepository categoryRepository;
	

	@Override
	public Map<String, String> findAllCategory() {
		Map<String, String> result = new HashMap<>();
		List<CategoryEntity> entities = categoryRepository.findAll(); 
		for(CategoryEntity item : entities) {
			result.put(item.getCode(), item.getName());
		}
		return result;
	}
}
