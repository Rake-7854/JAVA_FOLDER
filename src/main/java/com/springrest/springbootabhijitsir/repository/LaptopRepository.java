package com.springrest.springbootabhijitsir.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.springrest.springbootabhijitsir.entity.Laptop;

public interface LaptopRepository extends JpaRepository<Laptop, Integer>{

	List<Laptop> findByBrand(String brand);//if we want to create our own method/functionality
    //dynamic data we are using here      //dbvar //jvar
	@Query("SELECT l FROM Laptop l WHERE l.brand=:brand AND l.model=:model")
	List<Laptop> findByBrandAndModel(@Param("brand") String brand,@Param("model") String model);
}
