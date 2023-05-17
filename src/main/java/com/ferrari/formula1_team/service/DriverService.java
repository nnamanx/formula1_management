package com.ferrari.formula1_team.service;

import com.ferrari.formula1_team.dto.response.ResponseDto;
import com.ferrari.formula1_team.entity.Driver;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface DriverService {

    List<Driver> findAll(String key);

    Driver findById(Long id);

    ResponseEntity<ResponseDto> removeDriver(long id);
}
