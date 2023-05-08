package com.ferrari.formula1_team.repository;

import com.ferrari.formula1_team.entity.Team;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface TeamRepository extends JpaRepository<Team, Long> {

    @Query("update Team t set t.name = :name where t.id = :id")
    int updateTeamNameById(@Param("genre") String genre,
                           @Param("id") Long id);
}
