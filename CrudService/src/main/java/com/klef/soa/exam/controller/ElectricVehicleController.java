package com.klef.soa.exam.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.klef.soa.exam.entity.ElectricVehicle;
import com.klef.soa.exam.service.ElectricVehicleService;

@RestController
public class ElectricVehicleController {

    @Autowired
    private ElectricVehicleService service;

    @GetMapping("/")
    public String home() {
        return "Electric Vehicle CRUD Service is running";
    }

    @PostMapping("/Add")
    public ElectricVehicle add(@RequestBody ElectricVehicle vehicle) {
        return service.addElectricVehicle(vehicle);
    }

    @GetMapping("/DisplayAll")
    public List<ElectricVehicle> displayAll() {
        return service.getAllElectricVehicles();
    }

    @DeleteMapping("/Delete/{id}")
    public String delete(@PathVariable Long id) {
        return service.deleteElectricVehicle(id);
    }
} 