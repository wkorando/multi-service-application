package com.ibm.developer;

import org.springframework.data.repository.CrudRepository;

public interface StormRepo extends CrudRepository<Storm, Long> {
	public Iterable<Storm> findByStartLocation(String type);
}