package com.sirproject.SIR_Challenge;


import com.sirproject.SIR_Challenge.Repositories.TeamsRepo;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.test.annotation.Rollback;
import static org.assertj.core.api.Assertions.assertThat;


@DataJpaTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
@Rollback(value = false)
public class TeamRepoTest {

    @Autowired
    private TeamsRepo repo;

    @Autowired
    private TestEntityManager entityManager;

    @Test
    public void createTeam() {
        Team team = new Team();
        team.setTeamName("Strategy in Rush");
        team.setTeamCap("rubara");
        team.setCapMail("rubara1@gmail.com");
        team.setPosCap(3);
        team.setPlayer2("veselqka");
        team.setPosPlayer2(1);
        team.setPlayer3("BZM");
        team.setPosPlayer3(2);
        team.setPlayer4("LaJoya");
        team.setPosPlayer4(4);
        team.setPlayer5("Simo");
        team.setPosPlayer5(5);
        team.setTeamLogo("testlogo");

        Team savedTeam = repo.save(team);
        Team teamExist = entityManager.find(Team.class, savedTeam.getId());
        assertThat(team.getCapMail()).isEqualTo(teamExist.getCapMail());

    }
}
