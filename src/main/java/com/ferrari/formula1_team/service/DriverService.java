package com.ferrari.formula1_team.service;

import com.ferrari.formula1_team.entity.Driver;

import java.util.List;

public interface DriverService {

    List<Driver> findAll(String key);

    Driver findById(Long id);
}
