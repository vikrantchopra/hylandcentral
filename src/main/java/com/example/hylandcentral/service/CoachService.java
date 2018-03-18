package com.example.hylandcentral.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.hylandcentral.model.Coach;
import com.example.hylandcentral.repository.CoachRepository;

@Service
public class CoachService {

	@Autowired
	protected CoachRepository coachRepository;
	
	public Coach findByUsername(String username) {
		return this.coachRepository.findByUsername(username);
	}
}
