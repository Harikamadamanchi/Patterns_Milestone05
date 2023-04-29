package com.madamanchiClasses.DMS.repository;

import java.util.List;

/*
 * 
 * @author Harika Madamanchi - S555028
 * 
 */

import org.springframework.data.repository.CrudRepository;

import com.madamanchiClasses.DMS.Models.Dog;

public interface DogRepository extends  CrudRepository<Dog , Integer>{
	List<Dog> findByName(String name);

}
