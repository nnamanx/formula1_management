package com.ferrari.formula1_team.service.impl;

import com.ferrari.formula1_team.dto.response.ResponseDto;
import com.ferrari.formula1_team.entity.Team;
import com.ferrari.formula1_team.repository.TeamRepository;
import com.ferrari.formula1_team.service.TeamService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class TeamServiceImpl implements TeamService {

    private final TeamRepository teamRepository;

    @Override
    public ResponseEntity<ResponseDto> updateTeamName(String name, Long id) {

        return teamRepository.updateTeamNameById(name, id) > 0
                ? new ResponseEntity<>(ResponseDto.builder()
                .message("Updated Successfully!")
                .build(), HttpStatus.OK) :
                new ResponseEntity<>(ResponseDto.builder()
                        .message("Update Failed!")
                        .build(), HttpStatus.BAD_REQUEST);

        //why do we write ResponseEntity.ok?
    }

    @Override
    public List<Team> findAll() {
        return teamRepository.findAll();
    }
}
