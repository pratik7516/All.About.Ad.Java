package com.cdac.cntr;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cdac.dto.Car;
import com.cdac.service.CarService;

@RestController
public class CarController {
	
	@Autowired
	private CarService carService;
	
	@PostMapping(value = "car_add")
	public String carAdd(@RequestBody Car car) {
		carService.addCar(car); 
		return "success";
	}
	
	@GetMapping(value = "car_list")
	public List<Car> carList(){
		return carService.getAll();
	}
	
	@DeleteMapping(value = "car_del/{id}")
	public String carDelete(@PathVariable int id) {
		carService.removeCar(id);
		return "success";
	}
	
	@GetMapping(value = "get_car/{id}")
	public Car getCar(@PathVariable int id) {
		return carService.getCar(id);
	}
	
	@PutMapping(value = "car_update")
	public String carUpdate(@RequestBody Car car) {
		carService.modifyCar(car); 
		return "success";
	}
	
}
