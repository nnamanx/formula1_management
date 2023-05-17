package com.ferrari.formula1_team.service.impl;

import com.ferrari.formula1_team.dto.response.ResponseDto;
import com.ferrari.formula1_team.entity.Driver;
import com.ferrari.formula1_team.exception.DriverNotFoundException;
import com.ferrari.formula1_team.repository.DriverRepository;
import com.ferrari.formula1_team.service.DriverService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class DriverServiceImpl implements DriverService {

    private final DriverRepository driverRepository;
    private final ModelMapper modelMapper;

    @Override
    public List<Driver> findAll(String key) {
        return (key == null || key.isEmpty()) ? driverRepository.findAll() :
                driverRepository.findByNameLikeOrSurnameLikeOrTeam_NameLike(key, key, key);
    }

    @Override
    public Driver findById(Long id) {
        driverRepository.findById(id).
                orElseThrow(DriverNotFoundException::new); //? it was ()->new DriverNotFoundException()
        return null;
    }

    @Override
    public ResponseEntity<ResponseDto> removeDriver(long id) {
        driverRepository.delete(driverRepository.findById(id)
                .orElseThrow(DriverNotFoundException::new));
        return ResponseEntity.ok(new ResponseDto("Driver is removed successfully!"));
    }

}
