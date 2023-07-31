package com.springrest.springbootabhijitsir.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import com.springrest.springbootabhijitsir.dto.ResponseStructure;
import com.springrest.springbootabhijitsir.entity.Laptop;
import com.springrest.springbootabhijitsir.repository.LaptopDao;

@Service
public class LaptopService {

	@Autowired
	public LaptopDao dao;
	
	public ResponseStructure<Laptop> saveLaptop(Laptop laptop) {
//		return dao.saveLaptop(laptop);    //if we dont want statuscode(400,500)/timestamp method then use this line
		
		ResponseStructure<Laptop> rs = new ResponseStructure<>();
        Laptop laptop2 = dao.saveLaptop(laptop);
        
        rs.setData(laptop2);      //it is for STATUSCODE METHOD ERRORS(400,500)/timeStamp
        rs.setTimeStamp();
        rs.setMessage(HttpStatus.OK.name());
        rs.setStatucCode(HttpStatus.OK.value());
        return rs;
	}
	
	public Laptop updateLaptop(Laptop laptop) {
		return dao.updateLaptop(laptop);
	}
	
	public Laptop getDataById(int id) {
		return dao.getDataById(id);
	}
	
	public List<Laptop> getAllData(){
		return dao.getAllData();
	}
	
	public Laptop deleteById(int id) {
		return dao.deleteById(id);
	}
	
	public List<Laptop> getLaptopByBrand(String brand) {
		return dao.getLaptopByBrand(brand);
	}
	
	public List<Laptop> getLaptopByBrandAndModel(String brand,String model) {
		return dao.getLaptopByBrandAndModel(brand, model);
	}
}
