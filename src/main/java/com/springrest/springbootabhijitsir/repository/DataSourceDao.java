package com.springrest.springbootabhijitsir.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.springrest.springbootabhijitsir.entity.DataSource;

@Repository
public class DataSourceDao {

	@Autowired
	private DataSourceRepo repo;
	
	public DataSource saveDataSource(DataSource data) {
		return repo.save(data);
	}
	
	public DataSource update(DataSource data) {
		return repo.save(data);
	}
	
	public DataSource getById(int id) {
		return repo.findById(id).get();
	}
	
	public List<DataSource> getAll(){
		return repo.findAll();
	}
	
}
