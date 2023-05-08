package com.ferrari.formula1_team.service;

import com.ferrari.formula1_team.dto.response.ResponseDto;
import com.ferrari.formula1_team.entity.Team;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface TeamService {

    ResponseEntity<ResponseDto> updateTeamName(String name, Long id);
    List<Team> findAll();
}
