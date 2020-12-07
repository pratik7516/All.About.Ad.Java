package com.cdac.service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cdac.dto.Car;
import com.cdac.repo.CarRepository;

@Service
public class CarServiceImple implements CarService {
	
	@Autowired
	private CarRepository carRepository;

	@Override
	public void addCar(Car car) {
		carRepository.save(car);
	}

	@Override
	public void removeCar(int id) {
		carRepository.deleteById(id);
	}

	@Override
	public Car getCar(int id) {
		Optional<Car> opt = carRepository.findById(id);
		return opt.get();
	}

	@Override
	public void modifyCar(Car car) {
		carRepository.save(car);
	}

	@Override
	public List<Car> getAll() {
		Iterable<Car> itr = carRepository.findAll();
		Iterator<Car> it = itr.iterator();
		List<Car> li = new ArrayList<Car>();
		while(it.hasNext()) {
			li.add(it.next()); 
		}
		return li;
	}

}
