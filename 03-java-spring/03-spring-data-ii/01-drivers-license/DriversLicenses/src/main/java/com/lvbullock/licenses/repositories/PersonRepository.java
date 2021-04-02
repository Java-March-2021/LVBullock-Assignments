package com.lvbullock.licenses.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.lvbullock.licenses.models.Person;

@Repository
public interface PersonRepository extends CrudRepository<Person, Long>{
	//SELECT * FROM persons
	List<Person> findAll();
}
