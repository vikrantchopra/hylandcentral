package com.example.hylandcentral.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.hylandcentral.model.Employee;
import com.example.hylandcentral.repository.EmployeeRepository;

@Service
public class EmployeeService {
	
	@Autowired
	private EmployeeRepository employeeRepository;
	
	public Optional<Employee> findById(Long id) {
		return this.employeeRepository.findById(id);
	}
	
	public Iterable<Employee> getAllEmployees() {
		return this.employeeRepository.findAll();
	}
	
	public Employee findByUsername(String username) {
		return this.employeeRepository.findByUsername(username);
	}
	
	public List<Employee> findByTeam(String team) {
		return this.employeeRepository.findByTeam(team);
	}

}
