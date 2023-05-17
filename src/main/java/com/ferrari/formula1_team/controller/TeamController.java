package com.ferrari.formula1_team.controller;

import com.ferrari.formula1_team.dto.response.ResponseDto;
import com.ferrari.formula1_team.dto.response.TeamResponseDto;
import com.ferrari.formula1_team.entity.Driver;
import com.ferrari.formula1_team.entity.Team;
import com.ferrari.formula1_team.repository.TeamRepository;
import com.ferrari.formula1_team.service.TeamService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequiredArgsConstructor
@RequestMapping("/formula1")
public class TeamController {

    private final TeamService teamService;
    private final TeamRepository teamRepository;
    private final ModelMapper modelMapper;

    @GetMapping("/teams")
    public List<TeamResponseDto> team() {
        return teamService.findAll().stream()
                .map(team -> modelMapper.map(team, TeamResponseDto.class))
                .collect(Collectors.toList());
    }

    @PatchMapping("/{id}/name")
    public ResponseEntity<ResponseDto> changeNameById(@PathVariable Long id, @RequestBody String name) {
        return teamService.updateTeamName(name, id);
    }


    @PostMapping
    public Team saveTeam(@RequestBody Team team){ //instead of this write bookDto
        return teamRepository.save(team);
    }

}

