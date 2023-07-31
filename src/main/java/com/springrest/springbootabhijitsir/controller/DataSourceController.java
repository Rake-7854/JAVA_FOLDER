package com.springrest.springbootabhijitsir.controller;

import java.util.List;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.springrest.springbootabhijitsir.entity.DataSource;
import com.springrest.springbootabhijitsir.service.DataSourceService;

//@RestController
public class DataSourceController {

	@Autowired
	private DataSourceService service;
	
	@PostMapping("/save")
	public @ResponseBody DataSource save(@RequestBody DataSource data) {
		return service.save(data);
	}
	
	@PutMapping("/update")
	public @ResponseBody DataSource update(@RequestBody DataSource data) {
		return service.update(data);
	}
	
	@GetMapping("/getbyid/{id}")
	public DataSource getById(@PathVariable("id") int id) {
		return service.getById(id);
	}
	@GetMapping("/getall")
	public List<DataSource> getAll(){
		return service.getAll();
	}
	
}
