package com.cdac.service;

import java.util.List;

import com.cdac.dto.Car;

public interface CarService {
	public void addCar(Car car);
	public void removeCar(int id);
	public Car getCar(int id);
	public void modifyCar(Car car);
	public List<Car> getAll();
}
