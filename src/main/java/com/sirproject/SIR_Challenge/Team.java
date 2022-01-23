package com.sirproject.SIR_Challenge;


import net.bytebuddy.dynamic.loading.InjectionClassLoader;

import javax.persistence.*;

@Entity
//@Table(name = "teams")
public class Team {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, unique = true, length = 30)
    private String teamName;

    @Column(nullable = false, unique = true, length = 20)
    private String teamCap;

    @Column(nullable = false, unique = true, length = 30)
    private String capMail;

    @Column(nullable = false, unique = true, length = 1)
    private int posCap;

    @Column(nullable = false, unique = true, length = 5)
    private int p1mmr;

    @Column(nullable = false, unique = true, length = 20)
    private String player2;

    @Column(nullable = false, unique = true, length = 1)
    private int posPlayer2;

    @Column(nullable = false, unique = true, length = 5)
    private int p2mmr;

    @Column(nullable = false, unique = true, length = 20)
    private String player3;

    @Column(nullable = false, unique = true, length = 1)
    private int posPlayer3;

    @Column(nullable = false, unique = true, length = 5)
    private int p3mmr;

    @Column(nullable = false, unique = true, length = 20)
    private String player4;

    @Column(nullable = false, unique = true, length = 1)
    private int posPlayer4;

    @Column(nullable = false, unique = true, length = 5)
    private int p4mmr;

    @Column(nullable = false, unique = true, length = 20)
    private String player5;

    @Column(nullable = false, unique = true, length = 1)
    private int posPlayer5;

    @Column(nullable = false, unique = true, length = 5)
    private int p5mmr;

    @Column(nullable = false, unique = true, length = 80)
    private String teamLogo;



    public int getP1mmr() {
        return p1mmr;
    }

    public void setP1mmr(int p1mmr) {
        this.p1mmr = p1mmr;
    }

    public int getP2mmr() {
        return p2mmr;
    }

    public void setP2mmr(int p2mmr) {
        this.p2mmr = p2mmr;
    }

    public int getP3mmr() {
        return p3mmr;
    }

    public void setP3mmr(int p3mmr) {
        this.p3mmr = p3mmr;
    }

    public int getP4mmr() {
        return p4mmr;
    }

    public void setP4mmr(int p4mmr) {
        this.p4mmr = p4mmr;
    }

    public int getP5mmr() {
        return p5mmr;
    }

    public void setP5mmr(int p5mmr) {
        this.p5mmr = p5mmr;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    public String getTeamCap() {
        return teamCap;
    }

    public void setTeamCap(String teamCap) {
        this.teamCap = teamCap;
    }

    public String getCapMail() {
        return capMail;
    }

    public void setCapMail(String capMail) {
        this.capMail = capMail;
    }

    public int getPosCap() {
        return posCap;
    }

    public void setPosCap(int posCap) {
        this.posCap = posCap;
    }

    public String getPlayer2() {
        return player2;
    }

    public void setPlayer2(String player2) {
        this.player2 = player2;
    }

    public int getPosPlayer2() {
        return posPlayer2;
    }

    public void setPosPlayer2(int posPlayer2) {
        this.posPlayer2 = posPlayer2;
    }

    public String getPlayer3() {
        return player3;
    }

    public void setPlayer3(String player3) {
        this.player3 = player3;
    }

    public int getPosPlayer3() {
        return posPlayer3;
    }

    public void setPosPlayer3(int posPlayer3) {
        this.posPlayer3 = posPlayer3;
    }

    public String getPlayer4() {
        return player4;
    }

    public void setPlayer4(String player4) {
        this.player4 = player4;
    }

    public int getPosPlayer4() {
        return posPlayer4;
    }

    public void setPosPlayer4(int posPlayer4) {
        this.posPlayer4 = posPlayer4;
    }

    public String getPlayer5() {
        return player5;
    }

    public void setPlayer5(String player5) {
        this.player5 = player5;
    }

    public int getPosPlayer5() {
        return posPlayer5;
    }

    public void setPosPlayer5(int posPlayer5) {
        this.posPlayer5 = posPlayer5;
    }

    public String getTeamLogo() {
        return teamLogo;
    }

    public void setTeamLogo(String teamLogo) {
        this.teamLogo = teamLogo;
    }





}
