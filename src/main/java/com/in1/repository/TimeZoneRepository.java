package com.in1.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.transaction.annotation.Transactional;

import com.in1.model.TimeZone;

public interface TimeZoneRepository extends CrudRepository<TimeZone, Integer> {

	@Transactional(readOnly=true)
	public List<TimeZone> findById(Integer id);  
	
}
