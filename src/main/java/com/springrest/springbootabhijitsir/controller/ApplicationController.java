package com.springrest.springbootabhijitsir.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.springrest.springbootabhijitsir.dto.ResponseStructure;
import com.springrest.springbootabhijitsir.entity.Laptop;
import com.springrest.springbootabhijitsir.service.LaptopService;

@RestController
@CrossOrigin("*")
public class ApplicationController {
//@ResposneBody is not medatory because internally restcontroller imlemented this annotation

	@Autowired
	private LaptopService service;

	@GetMapping("/getmessage")
	public String getMessage() {
		return "message from springboot project..";
	}

	@PostMapping("/savelaptop")
	public ResponseStructure<Laptop> saveLaptop(@RequestBody Laptop laptop) {
		return service.saveLaptop(laptop); /// same save method can work for update in springboot here not have any
											/// method like merge,update
	}

	//http://localhost:8080/updatelaptop
	@PutMapping("/updatelaptop")
	public Laptop updateLaptop(@RequestBody Laptop laptop) {
		return service.updateLaptop(laptop);
		/*
		 * if you want to update same id ,it is mandatory for give that id in ->
		 * ->postman,either it will generate new id always { "id": 4, "brand": "ACRE",
		 * "model": "32 bit", "processor": "256gb 8TB" }
		 */

	}

	// http://localhost:8080/getdatabyid/3
	@GetMapping("/getdatabyid/{id}")
	public Laptop getDataById(@PathVariable("id") int id) {
		return service.getDataById(id);
	}

	// http://localhost:8080/getdata
	@GetMapping("/getdata")
	public List<Laptop> getAllData() {
		return service.getAllData();
	}

	// http://localhost:8080/delete/?id=2
	@DeleteMapping("/delete")
	public Laptop deleteById(@RequestParam("id") int id) {
		return service.deleteById(id);
	}

	// http://localhost:8080/getbybrand/?brand=HP
	@GetMapping("/getbybrand")
	public List<Laptop> getLaptopByBrand(@RequestParam("brand") String brand) {
		return service.getLaptopByBrand(brand);
	}

	// http://localhost:8080/getbybrandandmodel/?brand=HP&model=32 bit
	@GetMapping("/getbybrandandmodel")
	public List<Laptop> getLaptopByBrandAndModel(@RequestParam("brand") String brand,
			@RequestParam("model") String model) {
		return service.getLaptopByBrandAndModel(brand, model);
	}
}
