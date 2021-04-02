package com.lvbullock.licenses.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.lvbullock.licenses.models.License;

@Repository
public interface LicenseRepository extends CrudRepository<License, Long>{
	//SELECT * FROM licenses
	List<License> findAll();
//	List<License> findTopByOrderByNumberDesc();

}
