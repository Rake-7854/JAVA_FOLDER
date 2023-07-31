package com.springrest.springbootabhijitsir.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
public class DataSource {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(nullable = false)
	private String dbName;
	@Column(nullable = false)
	private String userName;
	@Column(nullable = false)
	private String password;
	@Column(nullable = false)
	private String url;
	private String dbType;
	
}
