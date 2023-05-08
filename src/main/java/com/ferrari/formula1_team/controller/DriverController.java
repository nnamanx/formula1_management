package com.ferrari.formula1_team.controller;

import com.ferrari.formula1_team.entity.Driver;
import com.ferrari.formula1_team.entity.Team;
import com.ferrari.formula1_team.repository.DriverRepository;
import com.ferrari.formula1_team.service.DriverService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;


//@Controller
//@ResponseBody
// these two equal to @RestController

@RestController
@RequiredArgsConstructor
@RequestMapping("/formula1")
public class DriverController {

    private final DriverService driverService;
    private final DriverRepository driverRepository;

    @GetMapping("/drivers")
    public List<Driver> drivers(@RequestParam(name = "key", required = false) String key) { //required = false?
        return driverService.findAll(key);
    }

}

