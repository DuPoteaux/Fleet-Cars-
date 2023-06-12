package com.poto.main.services;

import java.util.List;
import java.util.Optional;

import com.poto.main.models.VehicleType;
import com.poto.main.repositories.VehicleTypeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class VehicleTypeService {
	
	@Autowired
	private VehicleTypeRepository vehicleTypeRepository;
	
	//Get All VehicleTypes
	public List<VehicleType> findAll(){
		return vehicleTypeRepository.findAll();
	}	
	
	//Get VehicleType By Id
	public Optional<VehicleType> findById(int id) {
		return vehicleTypeRepository.findById(id);
	}	
	
	//Delete VehicleType
	public void delete(int id) {
		vehicleTypeRepository.deleteById(id);
	}
	
	//Update VehicleType
	public void save(VehicleType vehicleType) {
		vehicleTypeRepository.save(vehicleType);
	}

}
