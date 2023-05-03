package com.csf.supermarket.repository;

import org.springframework.data.repository.CrudRepository;

import com.csf.supermarket.model.Category;

//repository that extends CrudRepository  

public interface CategoryRepository extends CrudRepository<Category, Integer>  
{  
}  
