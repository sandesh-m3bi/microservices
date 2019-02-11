package com.demo.mmmbi.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.mmmbi.model.VehicleInsurance;
import com.demo.mmmbi.repository.VehicleInsuranceRepository;

@Service
@Transactional
public class VehicleInsuranceServiceImp implements VehicleInsuranceService {
	@Autowired
	VehicleInsuranceRepository vehicleInsuranceRepository;

	public void createUser(VehicleInsurance user) {
		// TODO Auto-generated method stub
		vehicleInsuranceRepository.save(user);
	}

	public List<VehicleInsurance> getAllVehicleInsurance() {
		// TODO Auto-generated method stub
		return (List<VehicleInsurance>) vehicleInsuranceRepository.findAll();
	}

/*	public VehicleInsurance findById(long id) {
		// TODO Auto-generated method stub
		return vehicleInsuranceRepository.findOne(id);
	}*/

	public VehicleInsurance update(VehicleInsurance user, long l) {
		// TODO Auto-generated method stub
		return vehicleInsuranceRepository.save(user);
	}

	public void deleteVehicleInsuranceById(long id) {
		// TODO Auto-generated method stub
		vehicleInsuranceRepository.deleteById(id);
	}

	
	
}