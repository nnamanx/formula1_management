package com.ferrari.formula1_team.repository;

import com.ferrari.formula1_team.entity.Driver;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DriverRepository extends JpaRepository<Driver, Long> {

    List<Driver> findByNameLikeOrSurnameLikeOrTeam_NameLike(String name, String surname, String team_name);
}
