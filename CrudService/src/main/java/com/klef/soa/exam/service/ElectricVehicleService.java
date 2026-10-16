package com.klef.soa.exam.service;

import java.util.List;

import com.klef.soa.exam.entity.ElectricVehicle;

public interface ElectricVehicleService {

    ElectricVehicle addElectricVehicle(ElectricVehicle vehicle);

    List<ElectricVehicle> getAllElectricVehicles();

    String deleteElectricVehicle(Long id);
}