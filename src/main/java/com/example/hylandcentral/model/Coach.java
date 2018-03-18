package com.example.hylandcentral.model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="coach")
public class Coach {

	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long id;
	
	private String username;
	
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "coach", cascade = CascadeType.PERSIST)
	private Set<Team> teamsManaged = new HashSet<>();
	
	public Coach() {}
	
	public Coach(String username, Set<Team> teamsManaged) {
		this.username = username;
		this.teamsManaged = teamsManaged;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public Set<Team> getTeamsManaged() {
		return teamsManaged;
	}

	public void setTeamsManaged(Set<Team> teamsManaged) {
		this.teamsManaged = teamsManaged;
	}
	
	public void addTeam(Team team) {
		this.teamsManaged.add(team);
		team.setCoach(this);
	}
	
	
}

