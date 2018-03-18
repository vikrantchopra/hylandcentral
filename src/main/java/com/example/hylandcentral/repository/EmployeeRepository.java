package com.example.hylandcentral.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.hylandcentral.model.Employee;

@Repository
public interface EmployeeRepository extends CrudRepository<Employee, Long> {
	
	Employee findByUsername(String username);
	
	List<Employee> findByTeam(String team);
}
