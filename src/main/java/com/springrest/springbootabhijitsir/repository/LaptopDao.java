package com.springrest.springbootabhijitsir.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.springrest.springbootabhijitsir.entity.Laptop;
import com.springrest.springbootabhijitsir.exceptionHandler.*;
@Repository
public class LaptopDao {

	@Autowired
	private LaptopRepository  repository;
	
	public Laptop saveLaptop(Laptop laptop) {
		return repository.save(laptop);
	}
	
	public Laptop updateLaptop(Laptop laptop) {
		return repository.save(laptop);
	}
	public Laptop getDataById(int id) {
//		return repository.findById(id).get();   //if you dont want to handleException not available data eneter 
	    
		Optional<Laptop> optional = repository.findById(id);
	    
	    if(optional.isPresent()) {
	    	return optional.get();    //if data is not there in db this method will execute
	    }
	    throw new NoDataForGivenIDFoundException();
	}
	
	public List<Laptop> getAllData(){
		return repository.findAll();
	}
	
	public Laptop deleteById(int id) {
		Laptop laptop = getDataById(id);
		repository.deleteById(id);
		return laptop;
	}
	
	public List<Laptop> getLaptopByBrand(String brand) {
		return repository.findByBrand(brand);
	}
	
	public List<Laptop> getLaptopByBrandAndModel(String brand,String model) {
		return repository.findByBrandAndModel(brand, model);
	}
	
	
}
