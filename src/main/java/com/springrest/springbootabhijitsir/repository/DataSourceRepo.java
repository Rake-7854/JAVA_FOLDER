package com.springrest.springbootabhijitsir.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.springrest.springbootabhijitsir.entity.DataSource;

public interface DataSourceRepo extends JpaRepository<DataSource, Integer>{
	
	@Modifying
	@Query("UPDATE DataSource d SET d.url = :url, d.password = :password WHERE d.id = :id")
	public DataSource updateUsernameAndPassword(@Param("url") String url, @Param("password") String password, @Param("id") int id);
      
}
