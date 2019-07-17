package com.Example.ConModule.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.repository.CrudRepository;

import com.Example.ConModule.model.ModuleModel;

public interface ModuleRepo extends CrudRepository<ModuleModel, Integer>{

	Iterable<ModuleModel> findAll();
	Page <ModuleModel> findAll(Page pageable)	;	
	
}
