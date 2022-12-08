package com.chap6.redispractice.repository;

import com.chap6.redispractice.dto.Aircraft;
import org.springframework.data.repository.CrudRepository;

public interface AircraftRepository extends CrudRepository<Aircraft, Long> {

}

