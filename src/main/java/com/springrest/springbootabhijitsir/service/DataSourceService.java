package com.springrest.springbootabhijitsir.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springrest.springbootabhijitsir.entity.DataSource;
import com.springrest.springbootabhijitsir.repository.DataSourceDao;

@Service
public class DataSourceService {

	@Autowired
	private DataSourceDao dao;
	
	public DataSource save(DataSource data) {
		return dao.saveDataSource(data);
	}
	
	public DataSource update(DataSource data) {
		return dao.update(data);
	}
	
	public DataSource getById(int id) {
		return dao.getById(id);
	}
	
	public List<DataSource> getAll(){
		return dao.getAll();
	}
}
