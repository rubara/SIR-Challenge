package com.sirproject.SIR_Challenge.Controllers;

import com.sirproject.SIR_Challenge.Team;
import com.sirproject.SIR_Challenge.Repositories.TeamsRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TeamController {

    @Autowired
    private TeamsRepo teamsRepo;

    @GetMapping("")
    public String homePageRegistration() {
        return "index";
    }

    @GetMapping("/registration")
    public String showRegistrationForm(Model model) {
        model.addAttribute("team", new Team());

        return "registration";
    }
}
