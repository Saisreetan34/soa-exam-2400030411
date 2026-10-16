package com.klef.soa.exam.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.klef.soa.exam.entity.ElectricVehicle;
import com.klef.soa.exam.repository.ElectricVehicleRepository;

@Service
public class ElectricVehicleServiceImpl implements ElectricVehicleService {

    @Autowired
    private ElectricVehicleRepository repository;

    @Override
    public ElectricVehicle addElectricVehicle(ElectricVehicle vehicle) {
        return repository.save(vehicle);
    }

    @Override
    public List<ElectricVehicle> getAllElectricVehicles() {
        return repository.findAll();
    }

    @Override
    public String deleteElectricVehicle(Long id) {

        if (repository.existsById(id)) {
            repository.deleteById(id);
            return "Electric Vehicle deleted successfully";
        }

        return "Electric Vehicle not found";
    }
}