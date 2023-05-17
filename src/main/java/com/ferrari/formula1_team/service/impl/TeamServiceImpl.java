package com.ferrari.formula1_team.service.impl;

import com.ferrari.formula1_team.dto.response.ResponseDto;
import com.ferrari.formula1_team.dto.response.TeamResponseDto;
import com.ferrari.formula1_team.repository.TeamRepository;
import com.ferrari.formula1_team.service.TeamService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class TeamServiceImpl implements TeamService {

    private final TeamRepository teamRepository;
    private final ModelMapper modelMapper;

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
    public List<TeamResponseDto> findAll() {

        return teamRepository.findAll().stream()
                .map(team -> modelMapper.map(team, TeamResponseDto.class))
                .collect(Collectors.toList());
    }

}
