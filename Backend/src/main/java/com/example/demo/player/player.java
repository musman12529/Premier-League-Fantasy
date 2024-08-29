package com.example.demo.player;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name = "player")
public class player {

    @Id
    private String player_name;


    private String nation;
    private String position;
    private Integer age;
    private Integer matches_played; // Changed from mp
    private Integer starts;
    private Double minutes_played;  // Changed from min
    private Double goals;           // Changed from gls
    private Double assists;         // Changed from ast
    private Double penalties_scored; // Changed from pk
    private Double yellow_cards;    // Changed from crdy
    private Double red_cards;       // Changed from crdr
    private Double expected_goals;  // Changed from xg
    private Double expected_assists;// Changed from xag
    private String team_name;       // Changed from team

    public player() {
        
    }

    public player(Long id, String player_name, String nation, String position, Integer age, Integer matches_played, Integer starts, Double minutes_played,
            Double goals, Double assists, Double penalties_scored, Double yellow_cards, Double red_cards, Double expected_goals, Double expected_assists, String team_name) {
        
        this.player_name = player_name;
        this.nation = nation;
        this.position = position;
        this.age = age;
        this.matches_played = matches_played;
        this.starts = starts;
        this.minutes_played = minutes_played;
        this.goals = goals;
        this.assists = assists;
        this.penalties_scored = penalties_scored;
        this.yellow_cards = yellow_cards;
        this.red_cards = red_cards;
        this.expected_goals = expected_goals;
        this.expected_assists = expected_assists;
        this.team_name = team_name;
    }

    public player(String player_name, String nation, String position, Integer age, Integer matches_played, Integer starts, Double minutes_played,
            Double goals, Double assists, Double penalties_scored, Double yellow_cards, Double red_cards, Double expected_goals, Double expected_assists, String team_name) {
        this.player_name = player_name;
        this.nation = nation;
        this.position = position;
        this.age = age;
        this.matches_played = matches_played;
        this.starts = starts;
        this.minutes_played = minutes_played;
        this.goals = goals;
        this.assists = assists;
        this.penalties_scored = penalties_scored;
        this.yellow_cards = yellow_cards;
        this.red_cards = red_cards;
        this.expected_goals = expected_goals;
        this.expected_assists = expected_assists;
        this.team_name = team_name;
    }

   

    public String getPlayer_name() {
        return player_name;
    }

    public void setPlayer_name(String player_name) {
        this.player_name = player_name;
    }

    public String getNation() {
        return nation;
    }

    public void setNation(String nation) {
        this.nation = nation;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Integer getMatches_played() {
        return matches_played;
    }

    public void setMatches_played(Integer matches_played) {
        this.matches_played = matches_played;
    }

    public Integer getStarts() {
        return starts;
    }

    public void setStarts(Integer starts) {
        this.starts = starts;
    }

    public Double getMinutes_played() {
        return minutes_played;
    }

    public void setMinutes_played(Double minutes_played) {
        this.minutes_played = minutes_played;
    }

    public Double getGoals() {
        return goals;
    }

    public void setGoals(Double goals) {
        this.goals = goals;
    }

    public Double getAssists() {
        return assists;
    }

    public void setAssists(Double assists) {
        this.assists = assists;
    }

    public Double getPenalties_scored() {
        return penalties_scored;
    }

    public void setPenalties_scored(Double penalties_scored) {
        this.penalties_scored = penalties_scored;
    }

    public Double getYellow_cards() {
        return yellow_cards;
    }

    public void setYellow_cards(Double yellow_cards) {
        this.yellow_cards = yellow_cards;
    }

    public Double getRed_cards() {
        return red_cards;
    }

    public void setRed_cards(Double red_cards) {
        this.red_cards = red_cards;
    }

    public Double getExpected_goals() {
        return expected_goals;
    }

    public void setExpected_goals(Double expected_goals) {
        this.expected_goals = expected_goals;
    }

    public Double getExpected_assists() {
        return expected_assists;
    }

    public void setExpected_assists(Double expected_assists) {
        this.expected_assists = expected_assists;
    }

    public String getTeam() {
        return team_name;
    }

    public void setTeam_name(String team_name) {
        this.team_name = team_name;
    }

    @Override
    public String toString() {
        return " player_name=" + player_name + ", nation=" + nation +
                ", position=" + position + ", age=" + age + ", matches_played=" + matches_played +
                ", starts=" + starts + ", minutes_played=" + minutes_played + ", goals=" + goals +
                ", assists=" + assists + ", penalties_scored=" + penalties_scored + ", yellow_cards=" + yellow_cards +
                ", red_cards=" + red_cards + ", expected_goals=" + expected_goals + ", expected_assists=" + expected_assists +
                ", team_name=" + team_name + "]";
    }
}
