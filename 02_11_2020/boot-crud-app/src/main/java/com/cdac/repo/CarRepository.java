package com.cdac.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.cdac.dto.Car;

@Repository
public interface CarRepository extends CrudRepository<Car, Integer> {

}
