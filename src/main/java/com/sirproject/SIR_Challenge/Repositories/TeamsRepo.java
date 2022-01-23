package com.sirproject.SIR_Challenge.Repositories;

import com.sirproject.SIR_Challenge.Team;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TeamsRepo extends JpaRepository<Team, Long> {
}
